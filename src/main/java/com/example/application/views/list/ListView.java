package com.example.application.views.list;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import com.vaadin.flow.router.RouterLink;



@PageTitle("list")
@Route(value = "")
@RouteAlias(value = "")
public class ListView extends VerticalLayout {

    public ListView() {
        setSpacing(false);

        Image img = new Image("images/Rudi.jpg", "Rudi");
        img.setWidth("200px");
        add(img);

        H2 header = new H2("Sign up for psych ward appointment?");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);

        Button button = new Button("Sign up?", click -> {
            Notification.show("We got ya!");
            getUI().ifPresent(ui -> ui.navigate("View2"));
        });

        HorizontalLayout layout = new HorizontalLayout(header, button);
        layout.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        add(layout);


        add(new Paragraph("Beanie Bellies Farm \uD83E\uDD8C\uD83D\uDEF7\uD83C\uDF84\uD83E\uDD20"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
