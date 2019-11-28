import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptop-parent',
  templateUrl: './laptop-parent.component.html',
  styleUrls: ['./laptop-parent.component.css']
})
export class LaptopParentComponent implements OnInit {

  selectedLappy;
  Laptops = [
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
    name : 'Asus',
    price :'Rs : 53000',
    dis :' ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2015/07/26/17/29/mixer-861431__340.jpg',
    name : 'HP',
    price : 'Rs : 53000',
    dis : ' ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'

  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2017/08/10/07/32/dell-2619501__340.jpg',
    name : 'Dell',
    price :'Rs : 53000',
    dis : ' ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'

  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
    name : 'MAC Book',
    price :'Rs : 53000',
    dis :' ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'

  }
];
  constructor() { }

  ngOnInit() {
  }
  sendLappy(lappy) {
    this.selectedLappy = lappy;
    console.log(lappy);
  }

}
