package view;

import controller.Listener;

public interface View {

    void setListener(Listener listener);

    void display(Object... args);
}
