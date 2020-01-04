package com.test.zhouyuting.impl;

import java.util.List;

import com.test.zhouyuting.bean.MusicBean;

public interface FileEvenListener {
	public void onScanFileDetailFinish(List<MusicBean> musicBeans);
}
