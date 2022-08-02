package com.xworkz.bars.runner;

import com.xworkz.bars.constants.BarType;
import com.xworkz.dao.BarDAO;
import com.xworkz.dao.BarDAOImpl;
import com.xworkz.dto.BarDTO;

public class BarRunner {

	public static void main(String[] args) {
		BarDTO bardto = new BarDTO(11,"abc","Hoskote",BarType.WINE_SHOP,40000D,40000*30D);
		BarDAO bardao = new BarDAOImpl();
		bardao.save(bardto);
		
		
		

	}

}
