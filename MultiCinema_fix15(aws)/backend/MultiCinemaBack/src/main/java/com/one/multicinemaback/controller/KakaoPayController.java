package com.one.multicinemaback.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.SbPayDto;
import com.one.multicinemaback.dto.TicketDto;
import com.one.multicinemaback.service.SbPayService;
import com.one.multicinemaback.service.TicketService;

@RestController
public class KakaoPayController {
	
	@Autowired
	SbPayService sbservice;
	
	@Autowired
	TicketService tiservice;

	@RequestMapping(value = "/sbkakaopay", method =RequestMethod.GET)
	public String kakaopay(String id, String product, String count, String payprice) throws UnsupportedEncodingException {
		System.out.println("KakaoPayController kakaopay()");
		System.out.println(id);
		String pname = URLEncoder.encode(product, "UTF-8");
		System.out.println(pname);
		try {
			URL address = new URL("https://kapi.kakao.com/v1/payment/ready");
			HttpURLConnection conn = (HttpURLConnection) address.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Authorization", "KakaoAK 704f7b7e7e27e8835b13944d7744c8c0");
			conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
			conn.setDoOutput(true);
			String parameter = "cid=TC0ONETIME&partner_order_id=1&partner_user_id=MultiCinema&item_name=" + pname + "&quantity=" + count + "&total_amount=" + payprice + "&vat_amount=200&tax_free_amount=0&approval_url=http://localhost:8090/MultiCinemaFront/views/main.html?page=kakaopay/SbPaySuccess.html?id=" + id + "?count=" + count + "?product="+pname+"?payprice="+payprice+"&fail_url=http://localhost:8090/MultiCinemaFront/views/kakaopay/SbPayFail.html&cancel_url=http://localhost:8090/MultiCinemaFront/views/kakaopay/SbPayFail.html";
			OutputStream give = conn.getOutputStream();
			DataOutputStream datagive = new DataOutputStream(give);
			datagive.writeBytes(parameter);
			datagive.close();
			
			int result = conn.getResponseCode();
			
			InputStream receive;
			if(result == 200) {
				receive = conn.getInputStream();
			}else {
				receive = conn.getErrorStream();
			}
			
			InputStreamReader reader = new InputStreamReader(receive);
			
			BufferedReader caster = new BufferedReader(reader);
			
			return caster.readLine();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "{\"result\":\"NO\"}";
	}
	
	@RequestMapping(value = "/kakaopayready", method = RequestMethod.GET)
	public String kakaopayready(String tid, Model model, String url) {
		
		System.out.println(tid);
		
		return "redirect:" + url;
	}
	
	@RequestMapping(value = "/insertsbpay", method = RequestMethod.POST)
	public String insertpay(SbPayDto dto) {
		System.out.println("KakaoPayController insertpay()");
		System.out.println(dto);
		
		sbservice.insertsbpay(dto);
		
		return "success";
	}
	
	@RequestMapping(value = "/getsbpay", method = RequestMethod.POST)
	public SbPayDto getspay(String tid) {
		System.out.println("KakaoPayController getspay()");
		System.out.println(tid);
		
		SbPayDto dto = sbservice.getsbpay(tid);
		
		System.out.println(dto);
		
		return dto;
	}
	
	@RequestMapping(value = "/delsbpay", method = RequestMethod.POST)
	public String delsbpay(String tid) {
		
		System.out.println(tid);
		
		boolean b = sbservice.delsbpay(tid);
		
		if(b == true) {
			return "success";
		}else {
			return "fail";
		}
		
	}
	
	@RequestMapping(value = "/tikakaopay", method =RequestMethod.GET)
	public String tikakaopay( String msnum, String id, String title, String time, String theater, String snum, String price) throws UnsupportedEncodingException {
		System.out.println("KakaoPayController tikakaopay()");
		System.out.println(id);
		String mtitle = URLEncoder.encode(title, "UTF-8");
		System.out.println(mtitle);
		System.out.println(theater);
		try {
			URL address = new URL("https://kapi.kakao.com/v1/payment/ready");
			HttpURLConnection conn = (HttpURLConnection) address.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Authorization", "KakaoAK 704f7b7e7e27e8835b13944d7744c8c0");
			conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
			conn.setDoOutput(true);
			String parameter = "cid=TC0ONETIME&partner_order_id=1&partner_user_id=MultiCinema&item_name=" + mtitle + "&quantity=1"+ "&total_amount=" + price + "&vat_amount=200&tax_free_amount=0&approval_url=http://localhost:8090/MultiCinemaFront/views/main.html?page=kakaopay/TiPaySuccess.html?msnum=" + msnum + "?id=" + id + "?title=" + mtitle + "?time=" + time + "?theater=" + theater + "?snum=" + snum + "?price=" + price + "&fail_url=http://localhost:8090/MultiCinemaFront/views/kakaopay/TiPayFail.html?msnum=" + msnum + "?snum=" + snum + "&cancel_url=http://localhost:8090/MultiCinemaFront/views/kakaopay/TiPayFail.html?msnum=" + msnum + "?snum=" + snum;
			OutputStream give = conn.getOutputStream();
			DataOutputStream datagive = new DataOutputStream(give);
			datagive.writeBytes(parameter);
			datagive.close();
			
			int result = conn.getResponseCode();
			
			InputStream receive;
			if(result == 200) {
				receive = conn.getInputStream();
			}else {
				receive = conn.getErrorStream();
			}
			
			InputStreamReader reader = new InputStreamReader(receive);
			
			BufferedReader caster = new BufferedReader(reader);
			
			return caster.readLine();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "{\"result\":\"NO\"}";
	}
	
	
	@RequestMapping(value = "/inserttipay", method = RequestMethod.GET)
	public String inserttipay(TicketDto dto) {
		System.out.println("KakaoPayController inserttipay()");
		System.out.println(dto);
		
		tiservice.inserttipay(dto);
		
		return "success";
	}
	
	@RequestMapping(value = "/gettipay", method = RequestMethod.POST)
	public TicketDto gettipay(TicketDto tdto) {
		System.out.println("KakaoPayController gettipay()");
		System.out.println(tdto);
		
		TicketDto dto = tiservice.gettipay(tdto);
		
		System.out.println(dto);
		
		return dto;
	}
	
	@RequestMapping(value = "/deltipay", method = RequestMethod.POST)
	public String deltipay(TicketDto tdto) {
		System.out.println("KakaoPayController deltipay()");
		System.out.println(tdto);
		
		boolean b = tiservice.deltipay(tdto);
		
		if(b == true){
			return "success";
		}else {
			return "fail";
		}
		
		
	}
}
