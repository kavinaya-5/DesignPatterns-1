package structuralpattern.proxypattern.smartapi;

import structuralpattern.proxypattern.smartapi.proxy.ApiProxy;
import structuralpattern.proxypattern.smartapi.subject.ApiService;

public class Main {
    public static void main(String[] args) {
        ApiService api = new ApiProxy();

        System.out.println(api.fetchData("weather"));
        System.out.println(api.fetchData("weather")); // cached
        System.out.println(api.fetchData("admin-data"));
    }
}
