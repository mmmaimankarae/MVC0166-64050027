/* Kitthanya Teachanontkullawat (Mine) 64050027 */
package controller;

import model.Model;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View theView;
    private Model theModel;

    /* Input & Output */
    private String inputText;
    private String result;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;

        /* Set Action when User click buttons */
        theView.addTypeOneButtonListener(new AnalyzeOneButtonListener());
        theView.addTypeTwoButtonListener(new AnalyzeTwoButtonListener());
    }

    /* Action for Analyze One Button */
    class AnalyzeOneButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputText = theView.getSourceCode();
            theModel.analyze(inputText);
            result = String.join("\n", theModel.getTypeOne());
            theView.setToken(result);
        }
    }

    /* Action for Analyze Two Button */
    class AnalyzeTwoButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            inputText = theView.getSourceCode();
            theModel.analyze(inputText);
            result = String.join("\n", theModel.getTypeTwo());
            theView.setToken(result);
        }
    }
}
