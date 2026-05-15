package structuralpattern.proxypattern.smartapi.proxy;

import structuralpattern.proxypattern.smartapi.realsubject.RealApiService;
import structuralpattern.proxypattern.smartapi.subject.ApiService;

import java.util.HashMap;
import java.util.Map;

public class ApiProxy implements ApiService {
    private RealApiService realApiService=new RealApiService();
    private Map<String,String> cache=new HashMap<>();

    public String fetchData(String request)
    {

        if(request.equals("admin-data"))
        {
            System.out.println("Access Denied");
            return null;
        }
        String data = realApiService.fetchData(request);

        // 💾 Store in cache
        cache.put(request, data);
        return data;
    }
}
