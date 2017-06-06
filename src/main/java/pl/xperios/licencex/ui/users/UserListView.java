package pl.xperios.licencex.ui.users;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = UserListView.VIEW_NAME)
public class UserListView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "userList";

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    void init() {
        setMargin(false);
        setSpacing(false);

        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
        addComponent(new Button("test"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        // the view is constructed in the init() method()
    }
}
