// ExoPlanets for 82 G. Eridani
// Semi-hypothetical planetary system

Remove "HD 20794 b"{ParentBody "HD 20794"}
Remove "HD 20794 c"{ParentBody "HD 20794"}
Remove "HD 20794 d"{ParentBody "HD 20794"}
Remove "HD 20794 e"{ParentBody "HD 20794"}

// Reference:
// Real objects: https://en.wikipedia.org/wiki/82_G._Eridani
// Hypothetical objects: https://tieba.baidu.com/p/6650689793
Planet	"82 G. Eri g"
{
	ParentBody     "82 G. Eri"
  DiscDate       "2017"
	Class          "Ferria"
  Mass           1.03
  TidalLocked    true

  Surface
  {
    Preset         "ferria_arid_rust_green.cfg"
  }

  //NoAtmosphere true

	Orbit
	{
		SemiMajorAxis   0.095
    PeriodDays      11.86
		Eccentricity    0.2
	}
}

Planet	"82 G. Eri b"
{
	ParentBody     "82 G. Eri"
  DiscDate       "2011"
	Class          "Terra"
	Mass            2.82
  TidalLocked     true

  Surface
  {
    Preset         "terra_arid_yellow_green_plants.cfg"
    volcanoMagn     0.56489
    volcanoFreq     1.5
    volcanoDensity  0.3
    volcanoOctaves  2
    volcanoActivity 2
    volcanoFlows    1
    volcanoRadius   0.8
    volcanoTemp     1671.8
    lavaCoverTidal  0.11428
    lavaCoverSun    0
    lavaCoverYoung  0.23664
  }

  Clouds
  {
    Height          56.848
    Velocity        117.87
    BumpHeight      7.7192
    Hapke           0
    SpotBright      2
    SpotWidth       0.03
    DayAmbient      0.07
    ModulateBright  1
    mainFreq        0.77256
    mainOctaves     10
    Coverage        0.35
    stripeZones     1
    stripeTwist     3.5
  }

  Clouds
  {
    Height          56.848
    Velocity        149.84
    BumpHeight      6.5811
    Hapke           0
    SpotBright      2
    SpotWidth       0.03
    DayAmbient      0.07
    ModulateBright  1
    mainFreq        0.77256
    mainOctaves     10
    Coverage        0.3
    stripeZones     1
    stripeTwist     3.5
  }

  Atmosphere
  {
    Model          "Venus"
    Height          404.06
    Density         25.029
    Pressure        127.84
    Greenhouse      1000
    Bright          10
    Opacity         1
    SkyLight        3.3333
    Hue             0
    Saturation      1

    Composition
    {
      H2O       	67.791
      CO2       	27.291
      N2        	4.8077
      SO2       	0.07234
      CO        	0.038028
      Ar        	0.0003152
    }
  }

	Orbit
	{
		SemiMajorAxis   0.127
    PeriodDays      18.33
		Eccentricity    0.27
	}
}

Planet	"82 G. Eri c"
{
	ParentBody     "82 G. Eri"
  DiscDate       "2011"
	Class          "Terra"
	Mass            2.52
  TidalLocked     true

  Surface
  {
    Preset         "terra_arid_mars_green_plants.cfg"
  }

	Orbit
	{
		SemiMajorAxis   0.225
    PeriodDays      43.17
		Eccentricity    0.17
	}
}

Planet	"82 G. Eri d"
{
	ParentBody     "82 G. Eri"
  DiscDate       "2011"
	Class          "Terra"
	Mass           4.77
  TidalLocked    true

  Surface
  {
    Preset         "terra_airless_moon.cfg"
  }

  //NoAtmosphere true

  Orbit
	{
		SemiMajorAxis   0.364
    PeriodDays      88.9
		Eccentricity    0.25
	}
}

Planet	"82 G. Eri e"
{
	ParentBody     "82 G. Eri"
  DiscDate       "2017"
	Class          "Terra"
	Mass            4.77
  RotationPeriod  18.594
  RotationEpoch   0
  Obliquity       13.861
  EqAscendNode    144.09

  Surface
  {
    Preset         "terra_arid_rocky_green.cfg"
  }

  Clouds
  {
    Height          23.044
    Velocity        109.35
    BumpHeight      7.9596
    Hapke           0
    SpotBright      2
    SpotWidth       0.03
    DayAmbient      0.07
    ModulateBright  1
    mainFreq        0.822
    mainOctaves     10
    Coverage        0.21597
    stripeZones     1.2906
    stripeTwist     0.13337
  }

  Clouds
  {
    Height          38.963
    Velocity        95.128
    BumpHeight      7.9596
    Hapke           0
    SpotBright      2
    SpotWidth       0.03
    DayAmbient      0.07
    ModulateBright  1
    mainFreq        0.822
    mainOctaves     10
    Coverage        0.21597
    stripeZones     1.2906
    stripeTwist     0.13337
  }

  Clouds
  {
    Height          54.882
    Velocity        94.366
    BumpHeight      7.9596
    Hapke           0
    SpotBright      2
    SpotWidth       0.03
    DayAmbient      0.07
    ModulateBright  1
    mainFreq        0.822
    mainOctaves     10
    Coverage        0.21597
    stripeZones     1.2906
    stripeTwist     0.13337
  }

  Atmosphere
  {
    Model          "Mars"
    Height          246.61
    Density         392.66
    Pressure        807.98
    Greenhouse      438.61
    Bright          10
    Opacity         1
    SkyLight        3.3333
    Hue             0
    Saturation      1

    Composition
    {
      N2        	59.159
      CO2       	26.554
      H2O       	9.4834
      SO2       	4.7786
      CO        	0.024559
      Ar        	0.00019619
      He        	3.6338e-05
    }
  }

  Rings
  {
    InnerRadius     12980
    OuterRadius     25227
    EdgeRadius      25227
    MeanRadius      17059
    Thickness       0.085293
    RocksMaxSize    0.0034117
    RocksSpacing    1
    DustDrawDist    255.88
    ChartRadius     25227
    RotationPeriod  3.342
    Brightness      1
    FrontBright     2.5987
    BackBright      4.716
    Density         0.95601
    Opacity         0.95601
    SelfShadow      0.95601
    PlanetShadow    0.95601
    Hapke           1
    SpotBright      1
    SpotWidth       0.02
    SpotBrightCB    0
    SpotWidthCB     0.001
    frequency       7.198
    densityScale    1.3823
    densityOffset   -0.14959
    densityPower    4.7991
    colorContrast   0.1288
    FrontColor      (0.700 0.700 0.700)
    BackThickColor  (0.800 0.600 0.400)
    BackIceColor    (0.300 0.700 1.000)
    BackDustColor   (1.000 0.980 0.880)
  }

	Orbit
	{
		SemiMajorAxis   0.509
    PeriodDays      147.02
		Eccentricity    0.29
	}
}

// Hypothetical Moons
DwarfMoon	"82 G. Eri e I"
{
	ParentBody     "82 G. Eri e"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxisKm 46802.8259
		Eccentricity    1.90200426e-05
		Inclination     0.00333535611
		AscendingNode   -80.8399386
		ArgOfPericenter 58.3802646
		MeanAnomaly     66.1466385
	}
}

DwarfMoon	"82 G. Eri e II"
{
	ParentBody     "82 G. Eri e"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxisKm 68549.3796
		Eccentricity    6.80408898e-05
		Inclination     0.000104623439
		AscendingNode   -158.735416
		ArgOfPericenter -156.817729
		MeanAnomaly     136.526371
	}
}

DwarfMoon	"82 G. Eri e III"
{
	ParentBody     "82 G. Eri e"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxisKm 1227801.02
		Eccentricity    0.328098487
		Inclination     224.783832
		AscendingNode   160.748489
		ArgOfPericenter 24.7964768
		MeanAnomaly     -35.9971164
	}
}

DwarfMoon	"82 G. Eri e IV"
{
	ParentBody     "82 G. Eri e"
	Class          "Asteroid"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxisKm 1293121.48
		Eccentricity    0.0155134718
		Inclination     23.7689416
		AscendingNode   13.9374941
		ArgOfPericenter 100.889225
		MeanAnomaly     -87.5819493
	}
}

//----------

Planet	"82 G. Eri f"
{
	ParentBody     "82 G. Eri"
	Class          "IceGiant"
  DiscDate       "2017"
  Mass           10.26
  Oblateness     0
  RotationPeriod  14
  RotationEpoch   0
  Obliquity       149.72
  EqAscendNode    142.67

  Surface
  {
    Preset         "neptune_frigid_uranus.cfg"
  }

  Clouds
	{
		Height          379.26
		Velocity        343.64
		BumpHeight      19.647
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.5
		mainOctaves     12
		Coverage        0.5
		stripeZones     3
		stripeFluct     0.6
		stripeTwist     20
	}

  Atmosphere
  {
    Model          "Earth"
    Height          921.08
    Density         573.62
    Pressure        98305
    Bright          10
    Opacity         0.35
    SkyLight        3
    Hue             0
    Saturation      1

    Composition
    {
      H2        	85.768
      He        	13.548
      CH4       	0.5404
      N2        	0.069828
      NH3       	0.047321
      O2        	0.012226
      C2H2      	0.0051961
      Ne        	0.0023223
      C2H4      	0.0021641
      Ar        	0.0016567
      C2H6      	0.0011422
      C8H18     	0.00065413
      C3H8      	0.00063372
      H2O       	5.3082e-06
      CO2       	3.1652e-06
      H2S       	2.5727e-06
      Kr        	7.2585e-07
      Xe        	7.0793e-08
      SO2       	1.5636e-08
      CO        	5.3778e-10
      Cl2       	5.3142e-10
    }
  }

	Orbit
	{
		SemiMajorAxis   0.875
    PeriodDays      331.41
		Eccentricity    0.05
	}
}

// Hypothetical Moons

Moon	"82 G. Eri f I"
{
	ParentBody     "82 G. Eri f"
	Class          "Aquaria"
	Radius          3173.1

  Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxisKm 82332.6061
		Eccentricity    0.00130427256
		Inclination     -0.688457573
		AscendingNode   -142.455725
		ArgOfPericenter -146.524461
		MeanAnomaly     168.632402
	}
}

Moon	"82 G. Eri f II"
{
	ParentBody     "82 G. Eri f"
	Class          "Aquaria"
  Radius          4464.2

  Life
  {
  	Class   "Organic"
  	Type    "Multicellular"
  	Biome   "Terrestrial"
  }

  Surface
  {
    Preset         "aquaria_wet_white_blue_seas.cfg"
  }

  Ocean
	{
		Height          5
		Composition
    {
      H2O     100
    }
	}

  Clouds
	{
		Height          8
		Velocity        169.61
		BumpHeight      4.2693
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.59633
		mainOctaves     10
		Coverage        0.4
		stripeZones     1.6328
		stripeTwist     0.20001
	}

  Atmosphere
	{
		Model          "Earth"
		Height          78.736
		Density         0.01147
		Pressure        0.0062767
		Greenhouse      0.1641
		Bright          10
		Opacity         0.5
		SkyLight        3
		Hue             0
		Saturation      1

		Composition
		{
			N2        	61.411
			O2        	23.01
			H2O       	15.374
			Ar        	0.19763
			CO2       	0.0040961
			CH4       	0.0016317
			He        	0.0015006
			Ne        	0.00029579
			CO        	2.892e-05
			Kr        	1.4599e-05
			Xe        	1.2938e-05
		}
	}

  Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxisKm 153944.65
		Eccentricity    0.0112717273
		Inclination     1.35503864
		AscendingNode   -7.17583255
		ArgOfPericenter -109.002115
		MeanAnomaly     172.310663
	}
}
