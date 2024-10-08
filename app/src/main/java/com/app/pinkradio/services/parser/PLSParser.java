package com.app.pinkradio.services.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;

public class PLSParser {

    public LinkedList<String> getRawUrl(String url) {
        LinkedList<String> murls = new LinkedList<String>();
        try {
            return getStreamingUrl(getConnection(url));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        murls.add(url);
        return murls;
    }

    public LinkedList<String> getStreamingUrl(URLConnection conn) {

        final BufferedReader br;
        String murl = null;
        LinkedList<String> murls = new LinkedList<String>();
        try {
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while (true) {
                try {
                    String line = br.readLine();
                    if (line == null) {
                        break;
                    }
                    murl = parseLine(line);
                    if (murl != null && !murl.equals("")) {
                        murls.add(murl);

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        murls.add(conn.getURL().toString());
        return murls;
    }

    private String parseLine(String line) {
        if (line == null) {
            return null;
        }
        String trimmed = line.trim();
        if (trimmed.indexOf("http") >= 0) {
            return trimmed.substring(trimmed.indexOf("http"));
        }
        return "";
    }

    private URLConnection getConnection(String url) throws IOException {
        URLConnection mUrl = new URL(url).openConnection();
        return mUrl;
    }

}