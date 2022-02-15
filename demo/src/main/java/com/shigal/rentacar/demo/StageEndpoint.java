package com.shigal.rentacar.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "stage")
public class StageEndpoint {

    Map<String, Stage> stages = new ConcurrentHashMap<>();

    // localhost:8080/actuator/stage will automatically call this GET method
    @ReadOperation
    public Map<String, Stage> getAllStages(){
        return stages;
    }

    @WriteOperation
    public void setValue(@Selector String name, int stage){ // here we are taking int value but internally we are creating the complex object
        stages.put(name, new Stage(stage));
    }

    @ReadOperation
    public Stage getStage(@Selector String name){ // http://localhost:8080/actuator/{name}
        return stages.get(name);
    }

    static class Stage{
        // every stage has to have a value - threshold value
        int val;

        public Stage(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }
}
