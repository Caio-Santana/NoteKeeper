package com.sam.notekeeper

data class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

data class NoteInfo(
    var course: CourseInfo? = null,
    var title: String? = null,
    var text: String? = null
) {
    override fun toString(): String {
        val course = this.course ?: "N/A"
        val title = this.title ?: "N/A"
        val text = this.text ?: "N/A"
        return "Course: $course\nTitle: $title\nNote: $text"
    }
}

