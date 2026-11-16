package com.rksolution.clockcalendar;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

public class ClockDateWidget extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager manager, int[] appWidgetIds) {
        for (int id : appWidgetIds) {
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_clock_date);
            views.setCharSequence(R.id.widget_time, "setFormat12Hour", "hh:mm");
            views.setCharSequence(R.id.widget_time, "setFormat24Hour", "HH:mm");
            views.setCharSequence(R.id.widget_date, "setFormat12Hour", "EEEE, dd MMM yyyy");
            views.setCharSequence(R.id.widget_date, "setFormat24Hour", "EEEE, dd MMM yyyy");
            manager.updateAppWidget(id, views);
        }
    }
}