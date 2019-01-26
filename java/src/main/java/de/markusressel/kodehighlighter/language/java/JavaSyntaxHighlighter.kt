package de.markusressel.kodehighlighter.language.java

import de.markusressel.kodehighlighter.core.StatefulSyntaxHighlighter
import de.markusressel.kodehighlighter.core.SyntaxColorScheme
import de.markusressel.kodehighlighter.core.SyntaxHighlighterRule
import de.markusressel.kodehighlighter.language.java.colorscheme.DarkBackgroundColorScheme
import de.markusressel.kodehighlighter.language.java.rule.*

/**
 * Java syntax highlighter
 */
class JavaSyntaxHighlighter : StatefulSyntaxHighlighter() {

    override fun getRules(): Set<SyntaxHighlighterRule> {
        return setOf(PackageKeywordRule(), ImportKeywordRule(), ClassKeywordRule(), AnnotationRule(), TypeKeywordRule(), ReturnKeywordRule(), VisibilityKeywordRule(), CommentRule())
    }

    override fun getDefaultColorScheme(): SyntaxColorScheme {
        return DarkBackgroundColorScheme()
    }

}