// 氐宿增一(EB**)
Star	"HD 132742 A"
{
	ParentBody     "HD 132742"
	Class          "B9.5V"
  MassSol        4.9
  RadSol         3.94
  Luminosity     86
  Teff           8800
  Age            0.5

	Orbit
	{
		PeriodDays      2.3274
		Eccentricity    0.07
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   76.6
	}
}

Star	"HD 132742 B"
{
	ParentBody     "HD 132742"
	Class          ""
  MassSol        1.7

	Orbit
	{
    PeriodDays      2.3274
		Eccentricity    0.07
		ArgOfPericenter 180
		MeanAnomaly     0
    //SemiAmplitude   218.7
	}
}

// 氐宿增五(***)
Remove "MU Lib (AB)"{ParentBody "MU Lib"}
Remove "MU Lib C"{ParentBody "MU Lib"}
Remove "MU Lib A"{ParentBody "MU Lib (AB)"}
Remove "MU Lib B"{ParentBody "MU Lib (AB)"}
Barycenter "HD 130559 AB"
{
	ParentBody "HD 130559"
	BinaryOrbit
	{
    Epoch           2451545
		Separation      941.7
		PositionAngle   294
	}
}

Star "HD 130559 A"
{
	ParentBody "HD 130559 AB"
	Class      "A1VpSrCrEu"
	MassSol    2.31
  RadSol     2.59
  Luminosity 41.7
  Teff       9592
  Age        0.417

  BinaryOrbit
	{
    Epoch           2453735.98659079
		Separation      139
		PositionAngle   5.5
	}
}

Star "HD 130559 B"
{
	ParentBody "HD 130559 AB"
	Class      "A6m"
	RadSol     2.59

  BinaryOrbit
	{
    Epoch           2453735.98659079
		Separation      139
		PositionAngle   5.5
	}
}

Star "HD 130559 C"
{
	ParentBody "HD 130559"
	Class      ""
	MassSol    0.5

  /*BinaryOrbit
	{
    Epoch           2451545
		Separation      941.7
		PositionAngle   294
	}*/
}

// 氐宿增二十(SB**)
Remove "EPS Lib A"{ParentBody "EPS Lib"}
Remove "EPS Lib B"{ParentBody "EPS Lib"}
Star "HD 137052 A"
{
	ParentBody "HD 137052"
	Class      "F3V"
	MassSol    1.17
	RadSol     1.5
	Luminosity 9.3
	Teff       6552
	FeH        0.09
	Age        1.5

	Orbit
	{
		PeriodDays      226.9437
		Eccentricity    0.6649
		Inclination     52.6
		Epoch           2453593.022
		ArgOfPericenter 159.84
		MeanAnomaly     0
	}
}

Star "HD 137052 B"
{
	ParentBody "HD 137052"
	Class      ""
	MassSol    0.41

	Orbit
	{
		PeriodDays      226.9437
		Eccentricity    0.6649
		Inclination     52.6
		Epoch           2453593.022
		ArgOfPericenter 339.84
		MeanAnomaly     0
	}
}

// 氐宿增廿二(**)
Star	"HD 139137 A"
{
	ParentBody     "HD 139137"
	Class          "K0III"

	Orbit
	{
		RefPlane        "Equator"
		Period          1529.71371
		Eccentricity    0.43726629
		Inclination     1.55366212
		AscendingNode   0
		ArgOfPericenter 109.977169
		MeanAnomaly     158.404124
	}
}

Star	"HD 139137 B"
{
	ParentBody     "HD 139137"
	Class          "A7"

	Orbit
	{
		RefPlane        "Equator"
		Period          1529.71371
		Eccentricity    0.43726629
		Inclination     1.55366212
		AscendingNode   0
		ArgOfPericenter 289.977169
		MeanAnomaly     158.404124
	}
}

// 氐宿增廿四(Ro**)
Remove "5 Ser A"{ParentBody "5 Ser"}
Remove "5 Ser B"{ParentBody "5 Ser"}
Star "HD 136202 A"
{
	ParentBody "HD 136202"
	Class      "F8IV"
	MassSol    1.16
	Luminosity 5
	Teff       6025
	FeH        0.02
	Age        5.27

	Orbit
	{
		Period          3371
		ArgOfPericenter 215
		MeanAnomaly     0
	}
}

Star "HD 136202 B"
{
	ParentBody "HD 136202"
	Class      "K4 V"

	Orbit
	{
		Period          3371
		ArgOfPericenter 35
		MeanAnomaly     0
	}
}

// 氐宿增廿五(PM**)
Star "HD 136514 A"
{
	ParentBody "HD 136514"
	Class      "K3III"
	MassSol    1.27
	RadSol     12
	Luminosity 55
	Teff       4417
	FeH        -0.02
	Age        6.03

	BinaryOrbit
	{
		Epoch           2453370.74439200
		Separation      243.017
		PositionAngle   21.8
	}
}

Star "HD 136514 B"
{
	ParentBody "HD 136514"
	Class      "K6.8 V"

	BinaryOrbit
	{
		Epoch           2453370.74439200
		Separation      243.017
		PositionAngle   21.8
	}
}

// 氐宿增廿八(**)
Star "HD 132933 A"
{
	ParentBody "HD 132933"
	Class      "M0.5IIb"

	BinaryOrbit
	{
		Separation      163.02
	}
}

Star "HD 132933 B"
{
	ParentBody "HD 132933"
	Class      "A4.6 V"

	BinaryOrbit
	{
		Separation      163.02
	}
}

// 氐宿增廿九(PM**)
Star "HD 132052 A"
{
	ParentBody "HD 132052"
	Class      "F2V"

	BinaryOrbit
	{
		Epoch           2451179.29119932
		Separation      613.12
		PositionAngle   297
	}
}

Star "HD 132052 B"
{
	ParentBody "HD 132052"
	Class      "M6"

	BinaryOrbit
	{
		Epoch           2451179.29119932
		Separation      613.12
		PositionAngle   297
	}
}

// 帝席增一(SB**)
Star "HD 120064 A"
{
	ParentBody "HD 120064"
	Class      "A7V" // F2p
	MassSol    1.8
	RadSol     3.7
	Teff       5848

	Orbit
	{
		PeriodDays      36.006
		Eccentricity    0.543
		Inclination     74.5
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   52.3
	}
}

Star "HD 120064 B"
{
	ParentBody "HD 120064"
	Class      "G5III" // G0IV
	MassSol    1.6
	RadSol     2.6
	Teff       6745
	Age        1.5

	Orbit
	{
		PeriodDays      36.006
		Eccentricity    0.543
		Inclination     74.5
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   59
	}
}

// 梗河增二(SB**)
Remove "46 Boo A"{ParentBody "46 Boo"}
Remove "46 Boo B"{ParentBody "46 Boo"}
Star "HD 134320 A"
{
	ParentBody "HD 134320"
	Class      "K2III"
	RadSol     23.35
	Luminosity 175.8
	Teff       4349
	FeH        -0.27

	Orbit
	{
		PeriodDays      2567.1
		Eccentricity    0.8315
		Inclination     62
		AscendingNode   82.6
		Epoch           2448356.6
		ArgOfPericenter 355.3
		MeanAnomaly     0
		//SemiAmplitude   9.25
	}
}

Star "HD 134320 B"
{
	ParentBody "HD 134320"
	Class      ""
	MassSol    0.6 // 0.8

	Orbit
	{
		PeriodDays      2567.1
		Eccentricity    0.8315
		Inclination     62
		AscendingNode   82.6
		Epoch           2448356.6
		ArgOfPericenter 175.3
		MeanAnomaly     0
	}
}

// 天乳增一(SB**)
Star "HD 140873 A"
{
	ParentBody "HD 140873"
	Class      "B8IV"
	MassSol    4.1
	Luminosity 383
	Teff       13932

	Orbit
	{
		PeriodDays      38.927
		Eccentricity    0.731
		Epoch           2450132.8
		ArgOfPericenter 21.8
		MeanAnomaly     0
		//SemiAmplitude   43.1
	}
}

Star "HD 140873 B"
{
	ParentBody "HD 140873"
	Class      "A"

	Orbit
	{
		PeriodDays      38.927
		Eccentricity    0.731
		Epoch           2450132.8
		ArgOfPericenter 201.8
		MeanAnomaly     0
		//SemiAmplitude   86
	}
}

// 阵车增二(**)
Star "HD 132219 A"
{
	ParentBody "HD 132219"
	Class      "A5IV"

	BinaryOrbit
	{
		Separation      60.088
	}
}

Star "HD 132219 B"
{
	ParentBody "HD 132219"
	Class      "F1.5 V"

	BinaryOrbit
	{
		Separation      60.088
	}
}
