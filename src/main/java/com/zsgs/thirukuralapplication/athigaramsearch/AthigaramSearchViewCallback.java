package com.zsgs.thirukuralapplication.athigaramsearch;

public interface AthigaramSearchViewCallback {

	void invalidSelection();

	void errorMessage();

	void showAllKuralInAthigaram(Long[] number, String[] line1, String[] line2, String[] tamilExplanation,
			String[] translation, String[] englishTranslation);

	void athigaramMenu();

	void goBack();

}