# Java Assignment Portfolio

An archive of Java coursework and practice projects from NIIT. It includes chapter exercises, file-handling examples, and small games. The highlighted project is **TrillionaireMind**, a console quiz game with local score saving; the related `RiddleGame` classes show earlier versions.

## Contents

- `src/Java/Chapter*` — Java fundamentals and object-oriented programming exercises.
- `src/Java/Project/FileProject` — file creation, reading, and writing examples.
- `src/Java/Project/NIITProject` — quiz and riddle game projects.
- WAV and PNG files in the project root — game media assets.

## Open in IntelliJ IDEA

1. Install JDK 21 or newer.
2. Open this folder in IntelliJ IDEA.
3. Select a class with a `main` method and choose **Run**.
4. For `TrillionaireMind`, keep the project root as the working directory so the game can find its media files.

There is no database or external service requirement. The game writes scores to `TrillionaireScore.txt` in the local project folder; that generated file is not included in this repository.
