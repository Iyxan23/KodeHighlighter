package de.markusressel.kodehighlighter.language.markdown.rule

import de.markusressel.kodehighlighter.core.rule.LanguageRule
import de.markusressel.kodehighlighter.core.rule.RuleHelper
import de.markusressel.kodehighlighter.core.rule.RuleMatch

class ListRule : LanguageRule {

    override fun findMatches(text: CharSequence): List<RuleMatch> {
        return RuleHelper.findRegexMatches(text, PATTERN)
    }

    companion object {
        val PATTERN = "(^\\s*)(?:[*+-]|\\d+\\.)(?=[\\t ].)".toRegex(RegexOption.MULTILINE)
    }

}