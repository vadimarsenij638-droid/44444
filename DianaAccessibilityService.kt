package com.diana.assistant.ua

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class DianaAccessibilityService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}
}
