package dk.easv.cvrlookupapp.gui.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;

public class AlertHelper {

    private AlertHelper() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    private static void showAlert(String title, String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void showError(String title, String message) {
        showAlert(title, message, Alert.AlertType.ERROR);
    }

}