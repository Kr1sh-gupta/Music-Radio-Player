package com.app.pinkradio;


public class Config {

    //Radio Station Name
    public static final String RADIO_NAME = "MAD PROJECT";

    //Radio Station URL
    public static final String RADIO_STREAM_URL = "http://stream.zeno.fm/3t49buv4ya0uv";

    ////Radio Station Genre (You can leave it empty)
    public static final String RADIO_GENRE = "Pop";

    //Radio Image URL
    public static final String RADIO_IMAGE_URL = "https://i.ibb.co/9WcG2SJ/radio-image.webp";

    //Background image blur amount
    public static final int BG_IMAGE_BLUR_AMOUNT = 20;

    //Enable or disable song metadata ("true" for enable and vice versa)
    public static final boolean SONG_METADATA = true;

    //Enable or disable image album art ("true" for enable and vice versa)
    public static final boolean IMAGE_ALBUM_ART = true;

    //Enable or disable autoplay ("true" for enable and vice versa)
    public static final boolean AUTOPLAY = true;

    //Enable or disable radio timeout ("true" for enable and vice versa)
    public static final boolean ENABLE_RADIO_TIMEOUT = true;

    //Radio timeout duration (if enabled)
    public static final int RADIO_TIMEOUT_CONNECTION = 10000;

    //Enable or disable circular image art ("true" for enable and vice versa)
    public static final boolean CIRCULAR_IMAGE_ALBUM_ART = true;

    //Enable or disable resume radio during a phone call ("true" for enable and vice versa) (needs extra permission)
    public static final boolean RESUME_RADIO_ON_PHONE_CALL = false;

    //Splash screen duration
    public static final int SPLASH_DURATION = 1000;

    //Enable or disable right to left mode ("true" for enable and vice versa) (eg: arabic language)
    public static final boolean ENABLE_RTL_MODE = false;

}
