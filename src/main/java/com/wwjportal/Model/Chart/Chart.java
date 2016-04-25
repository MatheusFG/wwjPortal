package com.wwjportal.Model.Chart;

/**
 * Created by User on 18/04/2016.
 */

public class Chart {

    private int chart_id;
    private String name;
    private String[] values;

    public int getChart_id() {
        return chart_id;
    }

    public void setChart_id(int chart_id) {
        this.chart_id = chart_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
}
