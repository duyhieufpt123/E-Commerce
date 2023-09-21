import React from 'react'
import { mainCarouselData } from './MainCarouselData'
import AliceCarousel from 'react-alice-carousel'
import 'react-alice-carousel/lib/alice-carousel.css';


const MainCarousel = () => {

    const items = mainCarouselData.map((items)=> <img className=' cursor-pointer -z-50' role='presentation' src={items.image} alt=""/>)

  return (
    <AliceCarousel items={items}
    disableButtonsControls
    autoPlay
    autoPlayInterval={2000}
    infinite
    absolute
    />
  )
}

export default MainCarousel