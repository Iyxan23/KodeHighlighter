package de.markusressel.kodehighlighter.core

import android.text.style.CharacterStyle

/**
 * Convenience base class for implementing a syntax highlighter
 */
abstract class SyntaxHighlighterBase : SyntaxHighlighter {

    override val appliedStyles: MutableSet<CharacterStyle> = mutableSetOf()

    override var colorScheme: SyntaxColorScheme = getDefaultColorScheme()

}