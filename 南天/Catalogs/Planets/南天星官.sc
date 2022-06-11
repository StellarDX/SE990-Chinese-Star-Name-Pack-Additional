// 海山增一(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=51986
Remove "p Vel A"{ParentBody "p Vel"}
Remove "p Vel B"{ParentBody "p Vel"}
Remove "p Vel Aa"{ParentBody "p Vel A"}
Remove "p Vel Ab"{ParentBody "p Vel A"}
// HIP plx 37.7 mas. Dyn.plx(AB) 38.4mas. EDR3: RUWE(A)=17.1
Barycenter "p Vel A/HD 92139"
{
	ParentBody "SEE 119"
	BinaryOrbit // VB6_Doc2015c SEE_119 Gr.2
	{
		Period          16.651
		Eccentricity    0.726
		Inclination     128.5
		AscendingNode   37.2
		Epoch           2458689.40129065
    ArgOfPericenter 108.9
		MeanAnomaly     0
	}

  /* BinaryOrbit // Tok2019, Circ.198
  {
    Period          16.68
    Eccentricity    0.77
    Inclination     123.5
    AscendingNode   36
    Epoch           2458787.28619993
    ArgOfPericenter 287.3
    MeanAnomaly     0
  } */
}

Star "HD 92139 A"
{
	ParentBody "HD 92139"
	Class      "F3IV"
	MassSol    2.13

	Orbit // SB9_623 1969MNRAS.142..523E
	{
		PeriodDays      10.2104
    Epoch           2416461.176
    Eccentricity    0.51
		ArgOfPericenter 5
		MeanAnomaly     0
	}
}

Star "HD 92139 B"
{
	ParentBody "HD 92139"
	Class      "F0V"
	MassSol    1.81

  Orbit
	{
		PeriodDays      10.2104
    Epoch           2416461.176
    Eccentricity    0.51
		ArgOfPericenter 185
		MeanAnomaly     0
	}
}

Star "HD 92140"
{
	ParentBody "SEE 119"
	Class      "A6V"
	MassSol    2.41

	/* Orbit
	{
    Period          16.651
		Eccentricity    0.726
		Inclination     128.5
		AscendingNode   37.2
		Epoch           2458689.40129065
    ArgOfPericenter 288.9
		MeanAnomaly     0
	} */
}

// 海山增二(**)
Remove "MU Vel A"{ParentBody "MU Vel"}
Remove "MU Vel B"{ParentBody "MU Vel"}
Star "HD 93497 A"
{
	ParentBody "HD 93497"
	Class      "G5III"
	MassSol    3.3
  RadSol     13
  Luminosity 107
  Teff       5047
  Age        0.36

	Orbit
	{
		Period          138
		Eccentricity    0.84
		Inclination     57
		AscendingNode   59.1
		Epoch           2433684.18987771
		ArgOfPericenter 358
		MeanAnomaly     0
	}
}

Star "HD 93497 B"
{
	ParentBody "HD 93497"
	Class      "G2V"
	MassSol    1.5

  Orbit
	{
		Period          138
		Eccentricity    0.84
		Inclination     57
		AscendingNode   59.1
		Epoch           2433684.18987771
		ArgOfPericenter 178
		MeanAnomaly     0
	}
}

// 三角形增一(*)
Remove "DEL TrA A"{ParentBody "DEL TrA"}
Remove "DEL TrA B"{ParentBody "DEL TrA"}

// 三角形增二(**)
Star "HD 138538 A"
{
	ParentBody "HD 138538"
	Class      "K0III"
	MassSol    1 // 2
  RadSol     16.2
  Luminosity 91
  Teff       4436

	BinaryOrbit
	{
		Epoch           2455196.95538591
		Separation      5061.42
		PositionAngle   220
	}
}

Star "HD 138538 B"
{
	ParentBody "HD 138538"
	Class      "A5V"

	/* BinaryOrbit
	{
		Epoch           2455196.95538591
		Separation      5061.42
		PositionAngle   220
	} */
}

// 三角形增三(Be**)
Remove "KAP1 Aps A"{ParentBody "KAP1 Aps"}
Remove "KAP1 Aps B"{ParentBody "KAP1 Aps"}
Star "HD 137387 A"
{
	ParentBody "HD 137387"
	Class      "B1npe"
	MassSol    12
	RadSol     3.75
  Luminosity 2120
  Teff       21500
	Age        0.0056

	BinaryOrbit
	{
		PeriodDays      0.6
	}
}

Star "HD 137387 B"
{
	ParentBody "HD 137387"
	Class      "B9.1 V"

	/* BinaryOrbit
	{
		PeriodDays      0.6
	} */
}

// 三角形增四(**)
Star "HD 138800 A"
{
	ParentBody "HD 138800"
	Class      "B7III"
  Luminosity 351

	BinaryOrbit
	{
		Separation      3600
	}
}

Star "HD 138800 B"
{
	ParentBody "HD 138800"
	Class      "K0V"

	/* BinaryOrbit
	{
		Separation      3600
	} */
}

// 孔雀增二(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=168339
Barycenter "HD 168339 A"
{
	ParentBody "HD 168339"
	BinaryOrbit
	{
		Period          2849
		Separation      448.8
	}
}

Star "HD 168339 Aa"
{
	ParentBody "HD 168339 A"
	Class      "K4III"
	MassSol    6.21
  RadSol     54.82
	Luminosity 729
	Teff       4051

	Orbit // SB9_1042 1928AnCap..10....8S
	{
		PeriodDays      2214
		Eccentricity    0.26
		Inclination     56 // VB6_Jnc2005 GLE_2A Gr.9
		AscendingNode   54.6
		Epoch           2418076.29499720
		ArgOfPericenter 7.2
		MeanAnomaly     0
		//SemiAmplitude   17.9
	}
}

Star "HD 168339 Ab"
{
	ParentBody "HD 168339 A"
	Class      ""
	MassSol    5.43

	Orbit
	{
		PeriodDays      2214
		Eccentricity    0.26
		Inclination     56 // VB6_Jnc2005 GLE_2A Gr.9
		AscendingNode   54.6
		Epoch           2418076.2
		ArgOfPericenter 187.2
		MeanAnomaly     0
	}
}

Star "HD 168339 B"
{
	ParentBody "HD 168339"
	Class      ""
	MassSol    1.49

	/* BinaryOrbit
	{
		Period          2849
		Separation      448.8
	} */
}

// 鸟喙增一(**)
Star	"HD 224392 A"
{
	ParentBody     "HD 224392"
	Class          "A1V"
	MassSol        1.94
	RadSol         1.8
	Luminosity     23
	Teff           9057

	Orbit
	{
		RefPlane        "Equator"
		Period          17331.8468
		Eccentricity    0.817240119
		Inclination     -0.511283875
		AscendingNode   0
		ArgOfPericenter 35.97411
		MeanAnomaly     -145.963184
	}
}

Star	"HD 224392 B"
{
	ParentBody     "HD 224392"
	Class          "F3.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          17331.8468
		Eccentricity    0.817240119
		Inclination     -0.511283875
		AscendingNode   0
		ArgOfPericenter 215.97411
		MeanAnomaly     -145.963184
	}
}

// 鹤增二(**)
Star "HD 213009 A"
{
	ParentBody "HD 213009"
	Class      "G6III"
  Luminosity 288
  Teff       5013
	FeH        -0.23

	BinaryOrbit
	{
		Separation      532
	}
}

Star "HD 213009 B"
{
	ParentBody "HD 213009"
	Class      "B8 V"

	/* BinaryOrbit
	{
		Separation      532
	} */
}

// 金鱼增一(PM**)
Star	"HD 50241 A"
{
	ParentBody     "HD 50241"
	Class          "A8VnkA6"
	MassSol        2.04
	RadSol         1.6
	Luminosity     13
	Teff           7530
	FeH            -0.11
	Age            0.66

	Orbit
	{
		PeriodDays      1618
		Eccentricity    0.39
		Inclination     118
		AscendingNode   24
		Epoch           2069135.95127439
		ArgOfPericenter 272
		MeanAnomaly     0
	}
}

Star	"HD 50241 B"
{
	ParentBody     "HD 50241"
	Class          "F8.6 V"

	Orbit
	{
		PeriodDays      1618
		Eccentricity    0.39
		Inclination     118
		AscendingNode   24
		Epoch           2069135.95127439
		ArgOfPericenter 92
		MeanAnomaly     0
	}
}

// 海石增一(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=45080
Barycenter "HD 79351 Aa"
{
	ParentBody "HD 79351"
	BinaryOrbit
	{
		RefPlane        "Equator"
		Period          302.445076
		Eccentricity    0.846061885
		Inclination     -2.34649992
		AscendingNode   0
		ArgOfPericenter -44.1704469
		MeanAnomaly     149.293541
	}
}

// DR2-HIP: dmu(A)=(+4.2, -1.5) mas/yr. EDR3: RUWE(A)=3.2
Star	"HD 79351 Aa1"
{
	ParentBody     "HD 79351 Aa"
	Class          "B2IV"
	MassSol        9.15
	RadSol         5
	Teff           21744
	Age            0.0187

	Orbit // SB9_561 1960MNRAS.121..263B
	{
		PeriodDays      6.7447
		Epoch           2416534.215
		Eccentricity    0.18
		ArgOfPericenter 293
		MeanAnomaly     0
	}
}

Star	"HD 50241 Aa2"
{
	ParentBody     "HD 79351 Aa"
	Class          ""
	MassSol        1.1

	Orbit
	{
		PeriodDays      6.7447
		Epoch           2416534.215
		Eccentricity    0.18
		ArgOfPericenter 113
		MeanAnomaly     0
	}
}

Star	"HD 79351 Ab"
{
	ParentBody     "HD 79351"
	Class          "B8.8 V"

	/* Orbit
	{
		RefPlane        "Equator"
		Period          302.445076
		Eccentricity    0.846061885
		Inclination     -2.34649992
		AscendingNode   0
		ArgOfPericenter 135.829553
		MeanAnomaly     149.293541
	} */
}

// 海石增二(PM**)
Star	"HD 76728 A"
{
	ParentBody     "HD 76728"
	Class          "B8II"
	RadSol         5
	Luminosity     449.05
	Teff           11880

	Orbit
	{
		RefPlane        "Equator"
		Period          15.377986
		Eccentricity    0.883555114
		Inclination     1.11174655
		AscendingNode   0
		ArgOfPericenter 91.4790809
		MeanAnomaly     118.874349
	}
}

Star	"HD 76728 B"
{
	ParentBody     "HD 76728"
	Class          "B7.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          15.377986
		Eccentricity    0.883555114
		Inclination     1.11174655
		AscendingNode   0
		ArgOfPericenter 271.479081
		MeanAnomaly     118.874349
	}
}
