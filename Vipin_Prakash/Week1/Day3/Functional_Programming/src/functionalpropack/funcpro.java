package functionalpropack;

import java.util.List;
import java.util.Optional;

public class funcpro {
	public void printWithFP(List<Integer> l)
	{
		l.stream().forEach(element->System.out.println(element));
	}
	public void printEven(List<Integer> l)
	{
		l.stream().filter(element->element%2==0).forEach(element->System.out.println(element));
	}
	public int sum(List<Integer> l)
	{
		return  l.stream().reduce(0,(l1,l2)->(l1+l2));
	}
	public void distinct(List<Integer>l)
	{
		l.stream().distinct().forEach(e->System.out.println(e));
	}
	public void sorted(List<Integer>l)
	{
		l.stream().sorted().forEach(e->System.out.println(e));
	}
	public void sorteddistinct(List<Integer>l)
	{
		l.stream().distinct().sorted().forEach(e->System.out.println(e));
	}
	public Optional<Integer> maxeve(List<Integer>l)
	{
		return l.stream().filter(e->e%2==0).max((e1,e2)->Integer.compare(e1,e2));
	}
}

