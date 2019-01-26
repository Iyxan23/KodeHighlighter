package de.markusressel.kodehighlighter.language.kotlin.rule

import android.text.Spannable
import de.markusressel.kodehighlighter.core.SyntaxHighlighterRule

class VarKeywordRule : SyntaxHighlighterRule {

    override fun findMatches(spannable: Spannable): List<MatchResult> {
        return PATTERN.findAll(spannable).toList()
    }

    companion object {
        val PATTERN = "(lateinit\\s+)?var(?=\\s)|(const\\s+)?val(?=\\s)".toRegex()
    }

}