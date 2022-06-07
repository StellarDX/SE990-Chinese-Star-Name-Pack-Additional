// 55 Cnc System
// Reference: https://en.wikipedia.org/wiki/55_Cancri

Remove "55 Cnc A"{ParentBody "55 Cnc"}
Remove "55 Cnc B"{ParentBody "55 Cnc"}
Remove "55 Cnc b"{ParentBody "Copernicus"}
Remove "55 Cnc c"{ParentBody "Copernicus"}
Remove "55 Cnc d"{ParentBody "Copernicus"}
Remove "55 Cnc e"{ParentBody "Copernicus"}
Remove "55 Cnc f"{ParentBody "Copernicus"}

// ----------Stars---------- //
Star	"Copernicus A"
{
	ParentBody     "RHO1 Cnc"
	Class	         "K0IV"
  MassSol        0.905
  RadSol         0.943
  Luminosity     0.582
  Teff           5172
	FeH            0.35
	CtoO           0.78
  RotationPeriod 931.2
  Age            8.6

	Orbit
	{
    RefPlane        "Static"
	}
}

Star	"Copernicus B"
{
	ParentBody     "Copernicus A"
	Class	         "M4.5V"
  MassSol        0.255
  RadSol         0.285
  Luminosity     0.003
  Teff           3233
	FeH            0.36
  RotationPeriod 146.64

  Orbit
	{
    SemiMajorAxis   1065
		Inclination     88.7574663 // Generated
		AscendingNode   3.10539828 // Generated
	}
}

// ----------Planets---------- //
Planet	"Galileo Galilei/55 Cnc b"
{
	ParentBody     "Copernicus A"
	DiscMethod     "RadVel"
	DiscDate       "1996" // Butler, Marcy, California, USA, 1996.04.12
  Class          "GasGiant" // warm Jupiter
  Mass           261.89058512 // 255.406886168
	Oblateness     0

	Surface
	{
		Preset         "jupiter_frigid_uranus.cfg"
		stripeZones     7.3562
		stripeFluct     0.46622
		stripeTwist     12.193
		cycloneMagn     8.2096
		cycloneFreq     1.1224
		cycloneDensity  0.5754
		cycloneOctaves  5
		cycloneMagn2     0.2569
		cycloneFreq2     0.60149
		cycloneLatitude2 0.85
		cycloneOctaves2  3
	}

	Clouds
	{
		Height          230.34
		Velocity        1157.1
		BumpHeight      58.365
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.4898
		mainOctaves     12
		Coverage        0.40402
	}

	Clouds
	{
		Height          446.42
		Velocity        740.03
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.5
	}

	Atmosphere
	{
		Model          "Ethereal"
		Height          2175.1
		Density         5326.3
		Pressure        1e+06
		Bright          10
		Opacity         0.1
		SkyLight        3
		Hue             0
		Saturation      2

		Composition
		{
			H2        	93.782
			He        	5.8879
			CH4       	0.26367
			N2        	0.02943
			NH3       	0.022065
			O2        	0.0073162
			C2H2      	0.0033673
			C2H4      	0.001356
			Ne        	0.00089771
			Ar        	0.00071673
			C2H6      	0.00049084
			C8H18     	0.00032005
			C3H8      	0.00028317
			H2O       	3.0801e-06
			H2S       	1.6149e-06
			CO2       	1.3427e-06
			Kr        	4.1133e-07
			Xe        	4.0379e-08
			SO2       	9.6743e-09
			Cl2       	2.8156e-10
			CO        	2.7767e-10
		}
	}

	Orbit
	{
		//aphelion distance 0.116
    PericenterDist  0.113
    SemiMajorAxis   0.115
    Eccentricity    0.014
    PeriodDays      14.65162
    Inclination     85
    Epoch           2450002.94749
    LongOfPericen   131.94
    MeanLongitude   131.94
	}
}

Planet	"Tycho Brahe/55 Cnc c"
{
	ParentBody     "Copernicus A"
	DiscMethod     "RadVel"
	DiscDate       "2002" // Marcy et al., California, USA, 2002.06.13
	Class          "GasGiant"
	Mass           51.2 // half of Saturn
	Oblateness     0

	Surface
	{
		Preset         "neptune_temperate_default.cfg"
		stripeZones     8.7023
		stripeFluct     0.96183
		stripeTwist     10.84
		cycloneMagn     2.2337
		cycloneFreq     0.50277
		cycloneDensity  0.31399
		cycloneOctaves  2
	}

	Clouds
	{
		Height          100.04
		Velocity        1157.1
		BumpHeight      28.448
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.50382
		mainOctaves     10
		Coverage        0.61439
	}

	Clouds
	{
		Height          187.11
		Velocity        740.03
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.4
	}

	Atmosphere
	{
		Model          "Earth"
		Height          883.65
		Density         7804.5
		Pressure        1e+06
		Bright          10
		Opacity         0.5
		SkyLight        1
		Hue             0
		Saturation      1.5

		Composition
		{
			H2        	89.736
			He        	6.1818
			CH4       	2.8907
			C8H18     	0.34955
			C3H8      	0.33077
			C2H2      	0.27333
			C2H4      	0.11168
			C2H6      	0.059832
			N2        	0.033205
			NH3       	0.023662
			O2        	0.0071192
			Ne        	0.0011631
			Ar        	0.00085807
			CO2       	0.00014666
			H2S       	1.5987e-06
			Kr        	3.6524e-07
			H2O       	2.9535e-07
			Xe        	4.1601e-08
			CO        	3.0197e-08
			SO2       	9.0155e-09
			Cl2       	3.5325e-10
		}
	}

	Orbit
	{
		//aphelion distance 0.26
		PericenterDist  0.219
		SemiMajorAxis   0.24
		Eccentricity    0.086
		PeriodDays      44.3446
		Epoch           2449989.3385
		LongOfPericen   77.9
		MeanLongitude   77.9
	}
}

Planet	"Hans Lippershey/55 Cnc d"
{
	ParentBody     "Copernicus A"
	DiscMethod     "RadVel"
	DiscDate       "2002" // Marcy et al., California, USA, 2002.06.13
	Class          "GasGiant"
	Mass           991.6245456
	Oblateness     0

	Surface
	{
		Preset         "jupiter_temperate_light.cfg"
		stripeZones     10
		stripeFluct     1.2214
		stripeTwist     11.392
		cycloneMagn     19.491
		cycloneFreq     0.85968
		cycloneDensity  0.39581
		cycloneOctaves  5
		cycloneMagn2     0.61453
		cycloneFreq2     0.85828
		cycloneLatitude2 1
		cycloneOctaves2  0
	}

	Clouds
	{
		Height          16.945
		Velocity        1157.1
		BumpHeight      4.614
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.32061
		mainOctaves     12
		Coverage        0.59287
	}

	Clouds
	{
		Height          26.18
		Velocity        740.03
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.6
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          100
		Density         5783.9
		Pressure        1e+06
		Bright          10
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      0

		Composition
		{
			H2        	92.207
			He        	7.1879
			CH4       	0.45445
			N2        	0.032771
			C8H18     	0.024973
			NH3       	0.024908
			C2H2      	0.023422
			C3H8      	0.021075
			C2H4      	0.0095183
			O2        	0.007231
			C2H6      	0.005052
			Ne        	0.0012029
			Ar        	0.0009056
			CO2       	1.3523e-05
			H2O       	2.9986e-06
			H2S       	1.5956e-06
			Kr        	3.6517e-07
			Xe        	3.819e-08
			SO2       	9.6199e-09
			CO        	2.9864e-09
			Cl2       	3.4044e-10
		}
	}

	Orbit
	{
		//aphelion distance 5.92
		PericenterDist  5.63
		SemiMajorAxis   5.77
		Eccentricity    0.025
		PeriodDays      5218
		Epoch           2452500.6
		LongOfPericen   181.3
		MeanLongitude   181.3
	}
}

Planet	"Zacharias Janssen/55 Cnc e"
{
	ParentBody     "Copernicus A"
	DiscMethod     "RadVel"
	DiscDate       "2004" // McArthur et al., Texas, United States, 2004.08.30
	Class          "Carbonia"
	Radius         11959.006875
	Mass           7.99
	Albedo         0.43 // guess
	TidalLocked    true // The planet is extremely likely to be tidally locked

	Interior
	{
		Composition // mass fraction, values in percent
		{
			Carbides  33 // a third of the planet's mass would be carbon, much of which may be in the form of diamond
			Silicates	45.88
			Metals		21.12
		}
	}

	Surface
	{
		Preset         "55Cen_Diamond.cfg"
		SurfStyle       0.8229
		Randomize      (-0.448, 0.648, -0.624)
		colorDistMagn   0.044653
		colorDistFreq   1360
		detailScale     32768
		drivenDarkening 0
		seaLevel        0.10472
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.56314
		humidity        0.36602
		heightTempGrad  0.375
		beachWidth      0.00099871
		tropicWidth     0.5
		mainFreq        0.54662
		venusFreq       0.99866
		venusMagn       0.75915
		mareFreq        0
		mareDensity     0
		terraceProb     0.25854
		erosion         0
		montesMagn      0
		montesFreq      441.68
		montesSpiky     0.97256
		montesFraction  0.34087
		dunesMagn       0
		dunesFreq       62.953
		dunesFraction   0.0086895
		hillsMagn       0
		hillsFreq       1265.6
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      1.9001
		riversSin       4.9293
		riftsMagn       0
		riftsFreq       3.2905
		riftsSin        5.5798
		canyonsMagn     0
		canyonsFreq     281.06
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      0.98595
		cracksOctaves   0
		craterMagn      0
		craterFreq      32.809
		craterDensity   0
		craterOctaves   0
		// Large surface-temperature variations on 55 Cancri e have been attributed to possible volcanic activity releasing large clouds of dust which blanket the planet and block thermal emissions.
		volcanoMagn     0.63359
		volcanoFreq     0.69562
		volcanoDensity  0.83206
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     3000
		lavaCoverTidal  0.14504
		lavaCoverSun    0.083969
		lavaCoverYoung  0.10687
	}

	Clouds
	{
		Height          10.646
		Velocity        133.86
		BumpHeight      2.0024
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.5
		mainFreq        0.8951
		mainOctaves     10
		Coverage        0.36458
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          14.65
		Velocity        113.31
		BumpHeight      2.0024
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         1
	}

	Clouds
	{
		Height          18.655
		Velocity        129.49
		BumpHeight      2.0024
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.7
	}

	Atmosphere
	{
		Pressure        1.3816925734024179620034542314335 // 1.4 Bar
		Bright          7.5
		Opacity         0.35
		SkyLight        3.3333
		Hue             0.41603
		Saturation      1.2

		Composition // values in percent
		{
			N2        	77.7729 // The atmosphere may contain similar chemicals in Earth's atmosphere, such as nitrogen and possibly oxygen
			O2        	20.8625
			CO2       	0.9303 // Ehrenreich speculated that its volatile materials might be carbon dioxide instead of water or hydrogen.
			HCN       	0.4419127 // Hubble Space Telescope had detected hydrogen cyanide, but no water vapor
			//He        	0 // a spectroscopic study in 2020 failed to detect escaping helium
			H2        	0.00051 // This model is consistent with spectroscopic measurements claiming to have discovered the presence of hydrogen[20][21] and with other studies which were unable to discover a significant hydrogen-destruction rate.
		}
	}

	CometTail
	{
		MaxLength   0.16891
		GasToDust   0.5
		Particles   3426
		GasBright   0.184087
		DustBright  0.050869
		GasColor   (0.002 0.006 0.010)
		DustColor  (0.050 0.050 0.050)
	}

	Orbit
	{
		//aphelion distance 0.01617
		PericenterDist  0.01464
		SemiMajorAxis   0.01544
		Eccentricity    0.05
		PeriodDays      0.7365474
		Inclination     83.59
		Epoch           2449999.83643
		LongOfPericen   86
		MeanLongitude   86
	}
}

Planet	"Thomas Harriot/55 Cnc f"
{
	ParentBody     "Copernicus A"
	DiscMethod     "RadVel" // Doppler spectroscopy
	DiscDate       "2005" // announced by J. Wisdom, published by D. Fischer, United States, 2005.04.11 (announced), 2007.11.06 (published)
	Class          "GasGiant"
	Mass           49.8
	Oblateness     0

	Surface
	{
		Preset         "neptune_temperate_default.cfg" // Based on its temperature, it could be a Sudarsky Class II planet, covered in water clouds, or a Sudarsky Class III with no clouds and a dark azure color.
		stripeZones     1.8738
		stripeFluct     0.38549
		stripeTwist     1.8678
		cycloneMagn     1.7541
		cycloneFreq     0.62199
		cycloneDensity  0.52313
		cycloneOctaves  3
	}

	Clouds
	{
		Height          231.46
		Velocity        1157.1
		BumpHeight      30.253
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.095843
		mainOctaves     10
		Coverage        0.63864
	}

	Atmosphere
	{
		Model          "Earth"
		Height          559.65
		Density         6439.1
		Pressure        1e+06
		Bright          5
		Opacity         0.8
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	90.558
			He        	7.4652
			CH4       	1.4091
			C2H2      	0.1519
			C3H8      	0.14556
			C8H18     	0.132
			C2H4      	0.050626
			N2        	0.033336
			NH3       	0.022977
			C2H6      	0.022457
			O2        	0.0065649
			Ne        	0.0011475
			Ar        	0.00076692
			CO2       	6.2813e-05
			H2O       	1.9225e-06
			H2S       	1.7088e-06
			Kr        	3.6146e-07
			Xe        	3.4271e-08
			CO        	1.3453e-08
			SO2       	1.0137e-08
			Cl2       	2.7384e-10
		}
	}

	Orbit
	{
		//aphelion distance 0.833
		PericenterDist  0.73
		SemiMajorAxis   0.781
		Eccentricity    0.2
		PeriodDays      260
		Epoch           2450080.9108
		LongOfPericen   181.1
		MeanLongitude   181.1
	}
}
