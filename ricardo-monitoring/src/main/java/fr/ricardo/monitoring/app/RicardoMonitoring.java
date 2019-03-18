package fr.ricardo.monitoring.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import fr.ricardo.monitoring.mockbdd.RowBDD;
import fr.ricardo.monitoring.services.MonitoringService;

@ApplicationPath("api")
public class RicardoMonitoring extends Application {
	
	@Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(MonitoringService.class);
        classes.add(RowBDD.class);
        return classes;
    }
}
