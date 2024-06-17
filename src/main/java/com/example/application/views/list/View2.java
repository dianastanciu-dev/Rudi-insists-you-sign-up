package com.example.application.views.list;


import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("View2")

public class View2 extends VerticalLayout {
    public View2(){

        Image img = new Image("images/Rudi.jpg", "Rudi");
        img.setWidth("200px");
        add(img);
    }

}
