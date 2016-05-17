package com.wwjportal.Model.Chart;

import javax.persistence.*;

/**
 * Created by User on 18/04/2016.
 */

@Entity
public class Chart {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int chart_id;

    @Column(name = "chart_name")
    private String chart_name;

    @Column(name = "chart_values")
    private String[] chart_values;

    public int getChart_id() {
        return chart_id;
    }

    public void setChart_id(int chart_id) {
        this.chart_id = chart_id;
    }

    public String getChart_name() {
        return chart_name;
    }

    public void setChart_name(String chart_name) {
        this.chart_name = chart_name;
    }

    public String[] getChart_values() {
        return chart_values;
    }

    public void setChart_values(String[] chart_values) {
        this.chart_values = chart_values;
    }
}
