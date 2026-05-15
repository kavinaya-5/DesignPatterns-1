package structuralpattern.proxypattern.smartapi.realsubject;

import structuralpattern.proxypattern.smartapi.subject.ApiService;

public class RealApiService implements ApiService {

    public String fetchData(String request)
    {
        System.out.println("Calling real Api for:"+request);
        return "Data from API for"+request;
    }
}
