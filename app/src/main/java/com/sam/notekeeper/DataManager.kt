package com.sam.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses[course.courseId] = course

        course =
            CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses[course.courseId] = course

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses[course.courseId] = course

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses[course.courseId] = course
    }

    private fun initializeNotes() {
        var course = courses["android_intents"]
        notes.add(
            NoteInfo(
                course,
                "Android Intents",
                "Great course about Android Intents"
            )
        )

        course = courses["android_async"]
        notes.add(
            NoteInfo(
                course,
                "Android Async",
                "Great course about Android Async, very complicated topic in programming"
            )
        )

        course = courses["java_lang"]
        notes.add(
            NoteInfo(
                course,
                "Java Language",
                "Great course about Java Language, everything that you need to learn about Java"
            )
        )

        course = courses["java_core"]
        notes.add(
            NoteInfo(
                course,
                "Java Core",
                "Great course about Java Core, everything that you need to learn about Java Core"
            )
        )

    }
}