ideaDownloadDirectory in ThisBuild := file("set in buildref2")

val otherRoot = (project in file("."))
    .settings(ideaDownloadDirectory := file("set in buildref2"))