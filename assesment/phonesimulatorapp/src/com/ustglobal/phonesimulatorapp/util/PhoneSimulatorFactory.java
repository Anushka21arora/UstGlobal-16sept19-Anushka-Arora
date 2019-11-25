package com.ustglobal.phonesimulatorapp.util;

import com.ustglobal.phonesimulatorapp.dao.PhoneSimulatorDao;
import com.ustglobal.phonesimulatorapp.dao.PhoneSimulatorDaoImpl;

public class PhoneSimulatorFactory {
public static PhoneSimulatorDao getPhoneSimulator() {
	return new PhoneSimulatorDaoImpl();
}
}
