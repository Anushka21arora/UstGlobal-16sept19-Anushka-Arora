import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile-parent',
  templateUrl: './mobile-parent.component.html',
  styleUrls: ['./mobile-parent.component.css']
})
export class MobileParentComponent implements OnInit {
  selectedMobile;
  Mobiles = [
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/11/29/12/30/android-1869510__340.jpg',
    name : 'Redmi',
    price : 'Rs : 14999',
    dis: 'ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938__340.jpg',
    name : 'Samsung',
    price : 'Rs : 14999',
    dis: ' ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'

  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/11/22/23/40/electronics-1851218__340.jpg',
    name : 'Sony',
    price : 'Rs : 14999',
    dis: ' ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'

  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
    name : 'IPHONE',
    price : 'Rs : 14999',
    dis: ' ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'

  }
];
  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile) {
    this.selectedMobile = mobile;
    console.log(mobile);
  }

}