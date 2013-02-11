package com.twofours.surespot;

public class IdentityOperationResult {
	private String mResultText;
	private Boolean mResultSuccess;

	public String getResultText() {
		return mResultText;
	}

	public void setResultText(String resultText) {
		this.mResultText = resultText;
	}

	public Boolean getResultSuccess() {
		return mResultSuccess;
	}

	public void setResultSuccess(Boolean resultSuccess) {
		this.mResultSuccess = resultSuccess;
	}

	public IdentityOperationResult(String resultText, Boolean resultSuccess) {
		super();
		this.mResultText = resultText;
		this.mResultSuccess = resultSuccess;
	}

}
