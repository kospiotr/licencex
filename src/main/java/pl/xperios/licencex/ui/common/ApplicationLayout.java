package pl.xperios.licencex.ui.common;


import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.VerticalLayout;

public class ApplicationLayout extends CssLayout {

    private final CssLayout content;
    private final VerticalLayout wrapper;

    public ApplicationLayout(LeftNavbar leftNavbar, TopNavbar topNavbar) {
        setSizeFull();
        addStyleName("main-view");

        addComponent(leftNavbar);

        wrapper = new VerticalLayout();
        wrapper.setSizeFull();
        wrapper.setSpacing(false);
        wrapper.setMargin(false);
        addComponent(wrapper);
//        setExpandRatio(wrapper, 1.0f);

        wrapper.addComponent(topNavbar);

        content = new CssLayout();
        content.addStyleName("view-content");
        content.setSizeFull();
        wrapper.addComponent(content);
        wrapper.setExpandRatio(content, 1.0f);

    }


    public ComponentContainer getViewContainer() {
        return content;
    }


}
