name := "parentBuild"

lazy val otherBase = file("buildref2")
lazy val otherBuild = BuildRef(otherBase.toURI)
lazy val otherRoot = ProjectRef(otherBase, "otherRoot")

lazy val thisRoot = (project in file(".")).dependsOn(otherRoot)

ideaDownloadDirectory := file("set in buildref1")
ideaDownloadDirectory in otherBuild := file("set in buildref1 for otherBuild")
ideaDownloadDirectory in otherRoot := file("set in buildref1 for otherRoot")
