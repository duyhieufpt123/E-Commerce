import React from 'react'
import MainCarousel from '../../HomeCarousel/MainCarousel'
import HomeSectionCarousel from '../../HomeSectionCarousel/HomeSectionCarousel'
import { mens_kurta } from '../../../../Data/Men/men_kurta'

const HomePage = () => {
  return (
    <div>
      <MainCarousel/>

    <div className='space-y-10 py-20 flex flex-col px-5 lg:px--1'>
      <HomeSectionCarousel data={mens_kurta} sectionName={"Men's Kurta"}/>
      <HomeSectionCarousel data={mens_kurta} sectionName={"Men's Shoes"}/>
      <HomeSectionCarousel data={mens_kurta} sectionName={"Men's Shirt"}/>
      <HomeSectionCarousel data={mens_kurta} sectionName={"Women's Saree"}/>
    </div>

    </div>
  )
}

export default HomePage