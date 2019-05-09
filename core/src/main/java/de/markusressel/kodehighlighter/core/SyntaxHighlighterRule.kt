package de.markusressel.kodehighlighter.core

/**
 * Interface for a single highlighter rule.
 *
 * A rule is used to identify text passages that match the rule.
 * The styles that are applied to those passages are defined in a color scheme.
 */
interface SyntaxHighlighterRule {

    /**
     * Find segments in the spannable that are affected by this rule
     */
    fun findMatches(spannable: CharSequence): List<MatchResult>

}