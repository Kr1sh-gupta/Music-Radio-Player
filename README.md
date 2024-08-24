# Mobile App Development Project - Radio Music Player

![App Icon](https://github.com/Kr1sh-gupta/Music-Radio-Player/blob/main/app/src/main/res/drawable/radio.png)


## Overview

Radio music player Developed using Java in Android Studio, the app allows users to stream music, with additional features like automatic song metadata fetching, background updates, a left navigation drawer, and a set timer function to stop the radio player after a specified time.

## Features

- **Live Radio Streaming:** Listen to live radio music from various stations.
- **Public Api:** http://stream.zeno.fm/3t49buv4ya0uv
- **Automatic Metadata Fetching:** The app automatically fetches song metadata (title, artist) and updates the background image accordingly using an API.
- **Left Navigation Drawer:** Provides easy access to the Home screen, additional permissions, and an About section.
- **Set Timer Function:** Allows users to set a timer to automatically stop the radio player after a chosen duration.
- **Responsive UI:** Clean and modern user interface with seamless navigation.

## Screenshots

![Home Screen](https://github.com/Kr1sh-gupta/Music-Radio-Player/blob/main/screenshot/IMG-20240728-WA0012.jpg)
*Home Screen with song metadata and background image.*

![Navigation Drawer](https://github.com/Kr1sh-gupta/Music-Radio-Player/blob/main/screenshot/IMG-20240728-WA0014.jpg)
*Left Navigation Drawer with Home, Additional Permission, and About options.*

![App Icon](https://github.com/Kr1sh-gupta/Music-Radio-Player/blob/main/screenshot/IMG-20240728-WA0017.jpg)
*App Icon on the home screen.*

## How It Works

1. **Configuration (`config.java`):** The `config.java` file contains the API calls that fetch song metadata like the song title, artist name, and cover image. This data is used to update the UI dynamically.
  
2. **User Interface:** The main screen displays the current song’s metadata with a dynamically changing background. Users can control playback through simple UI controls.
  
3. **Navigation Drawer:** The left navigation drawer allows users to access different sections of the app, including social links.

4. **Set Timer:** Users can set a timer using the timer button. Once the timer ends, the radio player stops playing automatically.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Kr1sh-gupta/Music-Radio-Player.git
   ```
2. Open the project in Android Studio.
3. Build the project and run it on an Android device or emulator.

## Technologies Used

- **Java**
- **Android Studio**
- **API Integration** for fetching song metadata

## Future Enhancements

- **Add More Radio Stations:** Expand the number of available radio stations.
- **Custom Themes:** Allow users to switch between different themes.
- **User Profiles:** Enable user logins and custom settings.

## Contributing

Feel free to fork this repository and contribute by submitting a pull request. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

