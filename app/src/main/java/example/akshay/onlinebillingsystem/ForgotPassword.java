package example.akshay.onlinebillingsystem;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPassword extends Fragment {

    View mainView;

    EditText email_ET, coNo_ET;
    Button sendPasswordButton;

    String email, coNo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.activity_forgot_password,container,false);

        ((HomeActivity) getActivity()).setActionBarTitle("Forgot Password");

        email_ET = mainView.findViewById(R.id.fg_email);
        coNo_ET = mainView.findViewById(R.id.fg_number);
        sendPasswordButton = mainView.findViewById(R.id.send_password_button);
        sendPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        return mainView;
    }
}
