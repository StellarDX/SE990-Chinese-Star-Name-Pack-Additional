// 室宿增一(*Pl)
Remove "Dimidium"{ParentBody "Helvetios"}
Planet	"Dimidium/Bellerophon/51 Peg b"
{
	ParentBody     "GJ 882"
	DiscMethod     "RadVel" // ELODIE
	DiscDate       "1995" // Michel Mayor/Didier Queloz/OHP/France/1995.10.06
  Mass           146.2010548
  Radius         72000 // guess/a greater radius than that of Jupiter

	Orbit
	{
    //aphelion distance 0.0534
    PericenterDist  0.0520
		SemiMajorAxis   0.0527
    Eccentricity    0.013
    PeriodDays      4.230785
	}
}

// 室宿增二(SB**)
Star	"HD 218356 A"
{
	ParentBody     "HD 218356"
	Class          "K0.5II:Ba1CN-2CH-0.5"
  MassSol        5.4
  RadSol         41
  Luminosity     18.2 // ?
  AbsMagn        -1.32
  Teff           4185
  FeH            -0.21
  Age            0.1

	Orbit
	{
		PeriodDays      111.14
		Eccentricity    0
		Epoch           2451739.3
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   1.47
	}
}

Star	"HD 218356 B"
{
	ParentBody     "HD 218356"
	Class          "sdO"

  Orbit
	{
    PeriodDays      111.14
		Eccentricity    0
		Epoch           2451739.3
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 室宿增五(SB**)
Star	"HD 220088 A"
{
	ParentBody     "HD 220088"
	Class          "M0III"

	Orbit
	{
		RefPlane        "Equator"
		Period          66.8749049
		Eccentricity    0.56126231
		Inclination     0.325048685
		AscendingNode   0
		ArgOfPericenter -151.374492
		MeanAnomaly     -137.932032
	}
}

Star	"HD 220088 B"
{
	ParentBody     "HD 220088"
	Class          "F0.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          66.8749049
		Eccentricity    0.56126231
		Inclination     0.325048685
		AscendingNode   0
		ArgOfPericenter 28.6255077
		MeanAnomaly     -137.932032
	}
}

// 室宿增六(**)
Star	"HD 220222 A"
{
	ParentBody     "HD 220222"
	Class          "B6III"

	Orbit
	{
		RefPlane        "Equator"
		Period          64.8356137
		Eccentricity    0.513452768
		Inclination     2.45383381
		AscendingNode   0
		ArgOfPericenter 162.76777
		MeanAnomaly     -3.33517503
	}
}

Star	"HD 220222 B"
{
	ParentBody     "HD 220222"
	Class          "B7.3 IV"

  Orbit
	{
		RefPlane        "Equator"
		Period          64.8356137
		Eccentricity    0.513452768
		Inclination     2.45383381
		AscendingNode   0
		ArgOfPericenter 342.76777
		MeanAnomaly     -3.33517503
	}
}

// 离宫增一(**)
Star	"HD 212395 A"
{
	ParentBody     "HD 212395"
	Class          "F7V"
	MassSol        1.28
	RadSol         1.29
	Luminosity     2.85
	Teff           6169
	FeH            -0.18
	Age            4.1

	BinaryOrbit
	{
		Separation      15.6
		Period          250
	}
}

Star	"HD 212395 B"
{
	ParentBody     "HD 212395"
	Class          ""
	MassSol        0.8

	/*BinaryOrbit
	{
		Separation      15.6
		Period          250
	}*/
}

// 离宫增六(SB**)
Star	"HD 220318 A"
{
	ParentBody     "HD 220318"
	Class          "B9.5V"

	Orbit
	{
		RefPlane        "Equator"
		Period          12.8543359
		Eccentricity    0.353430629
		Inclination     -0.417490959
		AscendingNode   0
		ArgOfPericenter 20.1254408
		MeanAnomaly     -51.5613432
	}
}

Star	"HD 220318 B"
{
	ParentBody     "HD 220318"
	Class          "A6.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          12.8543359
		Eccentricity    0.353430629
		Inclination     -0.417490959
		AscendingNode   0
		ArgOfPericenter 200.125441
		MeanAnomaly     -51.5613432
	}
}

// 螣蛇增一(SB**)
Star	"HD 198084 A"
{
	ParentBody     "HD 198084"
	Class          "F8IV"
	MassSol        1.071
	Age            2.25

	Orbit
	{
		PeriodDays      494.16
		Eccentricity    0.551
		Inclination     24.53
		AscendingNode   325.21
		Epoch           2450205.92073957
		ArgOfPericenter 248.86
		MeanAnomaly     0
	}
}

Star	"HD 198084 B"
{
	ParentBody     "HD 198084"
	Class          "F9IV"
	MassSol        1.047

	Orbit
	{
		PeriodDays      494.16
		Eccentricity    0.551
		Inclination     24.53
		AscendingNode   325.21
		Epoch           2450205.92073957
		ArgOfPericenter 68.86
		MeanAnomaly     0
	}
}

// 螣蛇增七(EB**)
Star	"HD 219815 A"
{
	ParentBody     "HD 219815"
	Class          "A7V"
	MassSol        2.48
	RadSol         3.51
	Luminosity     49.2
	Teff           8200

	Orbit
	{
		PeriodDays      3.2196
		Eccentricity    0.03
		Inclination     60.2
		Epoch           2436094.876
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   71.6
	}
}

Star	"HD 219815 B"
{
	ParentBody     "HD 219815"
	Class          ""
	MassSol        1.32
	Luminosity     17.5
	Teff           6330

	Orbit
	{
		PeriodDays      3.2196
		Eccentricity    0.03
		Inclination     60.2
		Epoch           2436094.876
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 螣蛇增九(*Pl)
Remove "Spe"{ParentBody "Veritate"}
Planet	"Spe/14 And b"
{
	ParentBody     "GC 32703"
	DiscMethod     "RadVel" // Doppler Spectroscopy
	DiscDate       "2008" // Sato et al./2008.07.02
	Mass           1694.0252654

	Orbit
	{
		SemiMajorAxis   0.83
		Eccentricity    0
		PeriodDays      185.84
		Epoch           2452861.4
	}
}

// 螣蛇增十四(V**)
Star	"HD 220652 A"
{
	ParentBody     "HD 220652"
	Class          "M2IIIab"
	RadSol         54

	BinaryOrbit
	{
		Epoch           2455562.19758469
		Separation      23064
		PositionAngle   226
	}
}

Star	"HD 220652 B"
{
	ParentBody     "HD 220652"
	Class          "B6.4 V"

	/*BinaryOrbit
	{
		Epoch           2455562.19758469
		Separation      23064
		PositionAngle   226
	}*/
}

// 螣蛇增十八(EB**)
Star	"HD 224355 A"
{
	ParentBody     "HD 224355"
	Class          "F6V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00686731647
		Eccentricity    0
		Inclination     1.52200073
		AscendingNode   0
		ArgOfPericenter -137.299975
		MeanAnomaly     11.2296647
	}
}

Star	"HD 224355 B"
{
	ParentBody     "HD 224355"
	Class          "G9.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00686731647
		Eccentricity    0
		Inclination     1.52200073
		AscendingNode   0
		ArgOfPericenter 42.7000247
		MeanAnomaly     11.2296647
	}
}

// 雷电增一(**)
Star	"HD 217232 A"
{
	ParentBody     "HD 217232"
	Class          "A8V"

	BinaryOrbit
	{
		Separation      37.52
	}
}

Star	"HD 217232 B"
{
	ParentBody     "HD 217232"
	Class          "F6V"

	/*BinaryOrbit
	{
		Separation      37.52
	}*/
}

// 雷电增二(PM**)
Star	"HD 216735 A"
{
	ParentBody     "HD 216735"
	Class          "A1V"
	MassSol        2.84
	RadSol         3.1
	Luminosity     110
	Teff           9484
	Age            0.331

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0154549331
		Eccentricity    0
		Inclination     -1.11162758
		AscendingNode   0
		ArgOfPericenter 15.2297058
		MeanAnomaly     115.850306
	}
}

Star	"HD 216735 B(?)"
{
	ParentBody     "HD 216735"
	Class          "G9.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0154549331
		Eccentricity    0
		Inclination     -1.11162758
		AscendingNode   0
		ArgOfPericenter 195.229706
		MeanAnomaly     115.850306
	}
}

// 雷电增三(S**)
Star	"HD 218634 A"
{
	ParentBody     "HD 218634"
	Class          "M4IIIa" // S-type star?
	MassSol        3
	RadSol         126
	Luminosity     2697
	Teff           3707
	FeH            -0.99

	BinaryOrbit
	{
		Period          100 // 500
	}
}

Star	"HD 218634 B"
{
	ParentBody     "HD 218634"
	Class          "A3V"
	MassSol        1.9

	/*BinaryOrbit
	{
		Period          100 // 500
	}*/
}

// 雷电增七(EB**)
Star	"HD 222133 A"
{
	ParentBody     "HD 222133"
	Class          "A0Vn"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.487183448
		Eccentricity    0.449712574
		Inclination     -0.82137537
		AscendingNode   0
		ArgOfPericenter 78.8987148
		MeanAnomaly     -111.877326
	}
}

Star	"HD 222133 B"
{
	ParentBody     "HD 222133"
	Class          "A9.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.487183448
		Eccentricity    0.449712574
		Inclination     -0.82137537
		AscendingNode   0
		ArgOfPericenter 258.898715
		MeanAnomaly     -111.877326
	}
}

// 垒壁阵增五(**)
Star	"HD 223825 A"
{
	ParentBody     "HD 223825"
	Class          "K0II"

	Orbit
	{
		RefPlane        "Equator"
		Period          31.4167198
		Eccentricity    0.621267378
		Inclination     -0.811762571
		AscendingNode   0
		ArgOfPericenter -142.868464
		MeanAnomaly     -110.797367
	}
}

Star	"HD 223825 B"
{
	ParentBody     "HD 223825"
	Class          "A7.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          31.4167198
		Eccentricity    0.621267378
		Inclination     -0.811762571
		AscendingNode   0
		ArgOfPericenter 37.1315362
		MeanAnomaly     -110.797367
	}
}

// 垒壁阵增七(EB**)
Star	"HD 352 A"
{
	ParentBody     "HD 352"
	Class          "K2IIICNIVp"
	Luminosity      470.86

	Orbit
	{
		RefPlane        "Equator"
		Period          32.7207409
		Eccentricity    0.279210329
		Inclination     2.07054031
		AscendingNode   0
		ArgOfPericenter 114.457381
		MeanAnomaly     -138.524582
	}
}

Star	"HD 352 B"
{
	ParentBody     "HD 352"
	Class          "B4.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          32.7207409
		Eccentricity    0.279210329
		Inclination     2.07054031
		AscendingNode   0
		ArgOfPericenter -65.5426187
		MeanAnomaly     -138.524582
	}
}

// 鈇钺增一(**)
Star	"104 Aqr A/BD-18 6358/HD 222574/HIP 116901"
{
	ParentBody     "104 Aqr"
	Class          "G2Ib"
	MassSol         4.23
	RadSol          31.9
	Luminosity      447
	Teff            5444
	FeH             0.05
	Age             0.135

	BinaryOrbit
	{
		Separation      26181.8
	}
}

Star	"104 Aqr B/BD-18 6359/HD 222561/HIP 116904"
{
	ParentBody     "104 Aqr"
	Class          "A5V"

	/*BinaryOrbit
	{
		Separation      26181.8
	}*/
}

// 鈇钺增二(**)
Star	"HD 223024 A"
{
	ParentBody     "HD 223024"
	Class          "F2III"
	RadSol          2.43
	Luminosity      16.647
	Teff            7482

	BinaryOrbit
	{
		Separation      420.794
	}
}

Star	"HD 223024 B"
{
	ParentBody     "HD 223024"
	Class          "F2V"
	RadSol          1.47
	Luminosity      4.421
	Teff            6889

	/*BinaryOrbit
	{
		Separation      420.794
	}*/
}
