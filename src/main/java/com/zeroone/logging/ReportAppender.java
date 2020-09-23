package com.zeroone.logging;

import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.layout.AbstractStringLayout;
import org.testng.Reporter;

import java.io.Serializable;

@Plugin(name = "Reporter", category = "Core", elementType = "appender", printObject = true)
public class ReportAppender extends AbstractAppender {


    private ReportAppender(final String name, final Layout layout) {
        super(name, null, layout, false);
    }

    @Override
    public void append(final LogEvent event) {
        final Layout<? extends Serializable> layout = getLayout();
        if (layout instanceof AbstractStringLayout) {
            Reporter.log(((AbstractStringLayout) layout).toSerializable(event));
        } else {
            Reporter.log(event.getMessage().toString());
        }
    }
}
