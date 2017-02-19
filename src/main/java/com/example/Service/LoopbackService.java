package com.example.Service;

import com.example.Entity.LoopbackRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoopbackService {

    private ArrayList<LoopbackRequest> requests;

    public LoopbackService(){
        requests = new ArrayList<>();
    }

    public void addRequest(LoopbackRequest newRequest){
        if(requests.size() > 3){
            requests.remove(0);
        }
        requests.add(newRequest);
    }

    public List<LoopbackRequest> getRequests(){
        return requests;
    }

    public String printRequests(){
        String toReturn = "No Requests Available";

        if(requests.size() > 0){
            toReturn = "<!doctype html><html><head><title>Loopback View</title></head><body>";
            for(int i=0; i < requests.size(); i++){
                toReturn +="Request "+i+": <br>" + requests.get(i).toStringForHtml();
            }
            toReturn +="</body></html>";
        }

        return toReturn;
    }
}
