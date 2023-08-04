package com.example.demo.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		MetodosHighOrder methigh=new MetodosHighOrder();
		MetodosReferenciados methRefer=new MetodosReferenciados();
		
	//supplier

	Stream<Integer> cedula = Stream.generate(methRefer::getId);
    List<Integer> cedulaList = cedula.limit(1).collect(Collectors.toList());

	LOG.info("supplier"+ cedulaList);
	
	//Consumer
	
	List<String> listProvincia = Arrays.asList("Quito ","Ambato ","Cotopaxi ","Esmeraldas ");
	listProvincia.replaceAll(methRefer::provincia);
	LOG.info("supplier"+ listProvincia);
	
	//predicate 
	List<Integer> bit = Arrays.asList(1,0,0,1,1,0,1,0,1);
	Stream<Integer> listbit=bit.stream().filter(methRefer::bit);
	listbit.forEach(methRefer::mensaje);
	LOG.info("predicate"+listbit);
	
	//function
	Stream<Integer> listfunction = listProvincia.stream().map(methRefer::aplicaF);
	listfunction.forEach(methRefer::mensaje);
	
	//Unary Operator
	List<Integer> listNum = Arrays.asList(3,2,1,4,3,5,7,8,3,5,6,12,32);
	Stream<Integer> listUnary=listNum.stream().map(
			numero->{
				//sumamos el 2 y sacamos el modulo del numero
				Integer num=2;
				num=(numero+num)%12;
				return num;
			}
			);
	listUnary.forEach(cadena->LOG.info(cadena.toString()));
		
	}
}



























