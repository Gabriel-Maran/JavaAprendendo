package com.gabrielmaran.aprendendojbdc.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;


public class CustomRowSetListener implements RowSetListener {
    private static final Logger log = LogManager.getLogger(CustomRowSetListener.class);

    @Override
    public void rowSetChanged(RowSetEvent event) {
        log.info("Command execute trigged");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        log.info("Row inserted, updated or deleted");
        if(event.getSource() instanceof RowSet){
            try {
                ((RowSet) event.getSource()).execute();
            } catch (SQLException e) {
                log.error("Error while trying to execute update", e);
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        log.info("Cursos moved");
    }
}
