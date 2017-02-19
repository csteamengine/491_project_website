package com.example.Entity;

public class LoopbackRequest {
    private boolean isValidJson;
    private String text;

    public LoopbackRequest(boolean isValidJson, String text){
        this.isValidJson = isValidJson;
        this.text = text;
    }

    public boolean isValidJson() {
        return isValidJson;
    }

    public void setValidJson(boolean validJson) {
        isValidJson = validJson;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "LoopbackRequest{" +
                "isValidJson=" + isValidJson +
                ", text='" + text + '\'' +
                '}';
    }

    public String toStringForHtml(){
        return "<p>Is Valid Json: <strong>" + isValidJson + "</strong><br>" +
                "Text Sent: " + text + "<br></p>";
    }
}
