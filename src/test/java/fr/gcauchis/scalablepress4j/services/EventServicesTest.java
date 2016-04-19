package fr.gcauchis.scalablepress4j.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import fr.gcauchis.scalablepress4j.model.Event;
import fr.gcauchis.scalablepress4j.model.PaginatedResultList;
import fr.gcauchis.scalablepress4j.services.EventServices;
import fr.gcauchis.scalablepress4j.test.PropertyTestConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { EventServices.class, PropertyTestConfiguration.class }, loader = AnnotationConfigContextLoader.class)
public class EventServicesTest {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private EventServices eventServices;
    
    @Before
    public void init() {
        eventServices.setBaseUrl(eventServices.getBaseUrl().replaceAll("v2", "v3"));
    }

    @Test
    public void context() {
        Assert.assertNotNull(eventServices);
    }
    
    @Test
    public void retrieve() {
        PaginatedResultList<Event> paginatedEventsList = eventServices.queryEvents(null, 1);
        Assert.assertNotNull(paginatedEventsList);
        Assert.assertNotNull(paginatedEventsList.getResult());
        log.info("Result: {}", paginatedEventsList);
    }
}