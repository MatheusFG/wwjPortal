package com.wwjportal.Model.Chart;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.ui.Model;

/**
 * Created by User on 18/04/2016.
 */
public class ChartJSON {

    public void json(Model model){


        String[] valores = {"0","5","30"};

        try {
            Chart chart = new Chart();
            chart.setChart_name("Pie");
            chart.setChart_values(valores);
            JSONObject graficosJSON = new JSONObject();
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("nome", chart.getChart_name());
            jsonObj.put("values", chart.getChart_values());
            graficosJSON.put("Gráficos",jsonObj);
            model.addAttribute("valores", graficosJSON);
            System.out.println(graficosJSON);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }



}
