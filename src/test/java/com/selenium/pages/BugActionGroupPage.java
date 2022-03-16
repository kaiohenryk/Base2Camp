package com.selenium.pages;

import com.selenium.bases.PageBase;
import org.openqa.selenium.By;

public class BugActionGroupPage extends PageBase {
    //Mapping
    By deleteIssues = By.cssSelector("input[value='Delete Issues']");

    //Actions
    public void clicarEmExcluirProblema(){
        click(deleteIssues);
    }
}
