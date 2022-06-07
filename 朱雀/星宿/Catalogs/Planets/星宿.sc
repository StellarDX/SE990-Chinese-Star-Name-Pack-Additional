// 星宿增一(**)
Star	"HD 81728 A"
{
	ParentBody     "HD 81728"
	Class	         "A0V"

	BinaryOrbit
	{
    Separation      144
	}
}

Star	"HD 81728 B"
{
	ParentBody     "HD 81728"
	Class	         "A3.1 V"

  /* BinaryOrbit
	{
    Separation      144
	} */
}

// 星宿增四(**)
Star	"HD 78556 A"
{
	ParentBody     "HD 78556"
	Class	         "B9V"
  RadSol         4.1
  Luminosity     240.19
  Teff           10395

	BinaryOrbit
	{
    Separation      358.15
	}
}

Star	"HD 78556 B"
{
	ParentBody     "HD 78556"
	Class	         "B8.3 V"

  /* BinaryOrbit
	{
    Separation      358.15
	} */
}

// 星宿增五(EB**)
// Ref: https://ui.adsabs.harvard.edu/abs/1975A%26A....40..207C/abstract
Remove "KW Hya A"{ParentBody "KW Hya"}
Remove "KW Hya B"{ParentBody "KW Hya"}
Star	"HD 79193 A"
{
	ParentBody     "HD 79193"
	Class	         "A5m"
  MassSol        1.97
  RadSol         2.13
  Luminosity     16.6
  Teff           8000

	Orbit
	{
    PeriodDays      7.75043
    Epoch           2441405.09
    ArgOfPericenter 233
    Eccentricity    0.11
    MeanAnomaly     0
	}
}

Star	"HD 79193 B"
{
	ParentBody     "HD 79193"
	Class	         "F0V"
  MassSol        1.49
  RadSol         1.48
  Luminosity     4.5
  Teff           6900

  Orbit
	{
    PeriodDays      7.75043
    Epoch           2441405.09
    ArgOfPericenter 53
    Eccentricity    0.11
    MeanAnomaly     0
	}
}

// 星宿增六(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=45527%20
Barycenter	"HD 79910 A"
{
	ParentBody     "HD 79910"
	BinaryOrbit
	{
    Period          725.141
	}
}

Star	"HD 79910 Aa"
{
	ParentBody     "HD 79910 A"
	Class	         "K2III"
  MassSol        3.12

	Orbit // VB6_HIP1997d KUI_40 Gr.9
	{
    Period          2.5244
    Epoch           2448797.91206327
    Eccentricity    0.293
    AscendingNode   282.8
    ArgOfPericenter 272.3
    Inclination     92.6
    MeanAnomaly     0
	}
}

Star	"HD 79910 Ab"
{
	ParentBody     "HD 79910 A"
	Class	         ""
  MassSol        1.4

  Orbit
	{
    Period          2.5244
    Epoch           2448797.91206327
    Eccentricity    0.293
    AscendingNode   282.8
    ArgOfPericenter 92.3
    Inclination     92.6
    MeanAnomaly     0
	}
}

Star	"HD 79910 B"
{
	ParentBody     "HD 79910"
	Class	         ""
  MassSol        0.84

  /* BinaryOrbit
	{
    Period          725.141
	} */
}

// 星宿增十二(**)
Remove "GAM Sex A"{ParentBody "GAM Sex"}
Remove "GAM Sex B"{ParentBody "GAM Sex"}
Star	"HD 85558 A"
{
	ParentBody     "HD 85558"
	Class	         "A1V"
  MassSol        2.6
  Luminosity     57
  Teff           9825
	Age            0.401

	Orbit
	{
    Period          77.55
		Eccentricity    0.691
		Inclination     145.1
		AscendingNode   31
    ArgOfPericenter 321.5
    MeanAnomaly     0
	}
}

Star	"HD 85558 B"
{
	ParentBody     "HD 85558"
	Class	         "A4V"

  Orbit
	{
		Period          77.55
		Eccentricity    0.691
		Inclination     145.1
		AscendingNode   31
    ArgOfPericenter 141.5
    MeanAnomaly     0
	}
}

// 星宿增十三(EB**)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=47427%20
Barycenter	"HD 83650 A"
{
	ParentBody     "HD 83650"
	BinaryOrbit
	{
    Period          628.258
	}
}

Star	"HD 83650 Aa"
{
	ParentBody     "HD 83650 A"
	Class	         "A0V"
  MassSol        3.81 // NOIRLab给出了一个大到离谱的值(7.62)/这里将其平分。
	AbsMagn        -1.24

  BinaryOrbit
	{
    PeriodDays       5.758
	}
}

Star	"HD 83650 Ab"
{
	ParentBody     "HD 83650 A"
	Class	         ""
  MassSol        3.81

  /* BinaryOrbit
	{
    PeriodDays       5.758
	} */
}

Star	"HD 83650 B"
{
	ParentBody     "HD 83650"
	Class	         ""
  MassSol        2.9

  /* BinaryOrbit
	{
    Period          628.258
	} */
}

// 天相增八(PM*2Pl)
Remove "24 Sex b"{ParentBody "24 Sex"}
Remove "24 Sex c"{ParentBody "24 Sex"}
Planet	"HD 90043 b"
{
	ParentBody     "HD 90043"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	Mass           632.4784762

	Orbit
	{
		SemiMajorAxis   1.333
		PeriodDays      452.8
		Eccentricity    0.09
	}
}

Planet	"HD 90043 c"
{
	ParentBody     "HD 90043"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	Mass           273.3324068

	Orbit
	{
		SemiMajorAxis   2.08
		PeriodDays      883
		Eccentricity    0.29
	}
}

// 天相增十二(**)
Star	"HD 93742 A"
{
	ParentBody     "HD 93742"
	Class	         "A2III"

	BinaryOrbit
	{
    Separation      233.28
	}
}

Star	"HD 93742 B"
{
	ParentBody     "HD 93742"
	Class	         "F6.3 V"

  /* BinaryOrbit
	{
    Separation      233.28
	} */
}

// 轩辕增四(**)
Star	"HD 77104 A"
{
	ParentBody     "HD 77104"
	Class	         "A2V"
	MassSol        2.73
	Luminosity     95.7
	Teff           8974
	Age            0.162

	BinaryOrbit
	{
		Epoch           2452640.25999444
    Separation      642.35
		PositionAngle   134
	}
}

Star	"HD 77104 B"
{
	ParentBody     "HD 77104"
	Class	         "G0.3 V"

	/* BinaryOrbit
	{
		Epoch           2452640.25999444
    Separation      642.35
		PositionAngle   134
	} */
}

// 轩辕增十二(**)
Star	"HD 75959 A"
{
	ParentBody     "HD 75959"
	Class	         "G7III"
	MassSol        6.49
	Luminosity     173.13
	Teff           4810
	FeH            0.08
	Age            0.645

	BinaryOrbit
	{
		Epoch           2457753.65077738
    Separation      210
		PositionAngle   310
	}
}

Star	"HD 75959 B"
{
	ParentBody     "HD 75959"
	Class	         "K0III"

	/* BinaryOrbit
	{
		Epoch           2457753.65077738
    Separation      210
		PositionAngle   310
	} */
}

// 轩辕增十三(PM**)
Star	"HD 76572 A"
{
	ParentBody     "HD 76572"
	Class	         "F4V"
	MassSol        1.4
	Teff           6396
	FeH            -0.34
	Age            2.5

	BinaryOrbit
	{
		Epoch           2456657.92418103
    Period          40.657
		PositionAngle   129
	}
}

Star	"HD 76572 B"
{
	ParentBody     "HD 76572"
	Class	         ""
	MassSol        1.4

	/* BinaryOrbit
	{
		Epoch           2456657.92418103
    Period          40.657
		PositionAngle   129
	} */
}

// 轩辕增十五(SB**)
Remove "75 Cnc A"{ParentBody "75 Cnc"}
Remove "75 Cnc B"{ParentBody "75 Cnc"}
Star	"HD 78418 A"
{
	ParentBody     "HD 78418"
	Class	         "G5IV"
  MassSol        1.173//24
  Teff           6000
	FeH            -0.09

	Orbit
	{
    PeriodDays      19.412347//23
		Eccentricity    0.19494//11
		Inclination     19.412347//23
		AscendingNode   171.892//85
		Epoch           2453895.9025//24
    ArgOfPericenter 103.389//39
    MeanAnomaly     0
		//SemiAmplitude   26.4961//35
	}
}

Star	"HD 78418 B"
{
	ParentBody     "HD 78418"
	Class	         ""
	MassSol        1.011//21
	Teff           5900

  Orbit
	{
		PeriodDays      19.412347//23
		Eccentricity    0.19494//11
		Inclination     19.412347//23
		AscendingNode   171.892//85
		Epoch           2453895.9025//24
    ArgOfPericenter 283.389//39
    MeanAnomaly     0
		//SemiAmplitude   30.7579//65
	}
}

// 轩辕增十七(PM**)
Star	"HD 77190 A"
{
	ParentBody     "HD 77190"
	Class	         "A8Vn"
	MassSol        1.89
	RadSol         1.9
	Luminosity     10.465
	Teff           7982
	Age            0.867

	BinaryOrbit
	{
    Separation      6100
	}
}

Star	"HD 77190 B"
{
	ParentBody     "HD 77190"
	Class	         "K2.8 V"

	/* BinaryOrbit
	{
    Separation      6100
	} */
}

// 轩辕增廿二(PM**)
Star	"轩辕增廿二/IOT Cnc A/HR 3475/HD 74739/BD+29 1824/HIP 43103/SAO 80416"
{
	ParentBody     "48 Cnc"
	Class	         "G8IIIaBa0.2"
	MassSol        3.43
	RadSol         21
	Luminosity     204
	Teff           4594
	FeH            -0.14

	BinaryOrbit
	{
    Separation      3060
	}
}

Star	"IOT Cnc B/HR 3474/HD 74738/BD+29 1823/HIP 43100/SAO 80415"
{
	ParentBody     "48 Cnc"
	Class	         "A2V"
	Luminosity     14.39
	Teff           8786
	Age            0.263

	/* BinaryOrbit
	{
    Separation      3060
	} */
}

// 轩辕增廿三(SB**)
Star	"HD 77350 A"
{
	ParentBody     "HD 77350"
	Class	         "A0III"
  MassSol        2.82
  Luminosity     93
  Teff           10250
	FeH            -0.2

	Orbit
	{
    PeriodDays      1401.4
		Eccentricity    0.35
		Epoch           2419687
    ArgOfPericenter 84
    MeanAnomaly     0
		//SemiAmplitude   7.7
	}
}

Star	"HD 77350 B"
{
	ParentBody     "HD 77350"
	Class	         "A6.7 V"

  Orbit
	{
		PeriodDays      1401.4
		Eccentricity    0.35
		Epoch           2419687
    ArgOfPericenter 264
    MeanAnomaly     0
	}
}

// 轩辕增廿四(SB**)
Star	"HD 78515 A"
{
	ParentBody     "HD 78515"
	Class	         "G9IIIFe-1CH-0.5"
  Luminosity     118
  Teff           5101

	Orbit
	{
    PeriodDays      1700.76
		Eccentricity    0.06
		Epoch           2428876.86
    ArgOfPericenter 121.1
    MeanAnomaly     0
		//SemiAmplitude   4.4
	}
}

Star	"HD 78515 B"
{
	ParentBody     "HD 78515"
	Class	         "A0.6 V"

  Orbit
	{
		PeriodDays      1700.76
		Eccentricity    0.06
		Epoch           2428876.86
    ArgOfPericenter 301.1
    MeanAnomaly     0
	}
}

// 轩辕增廿九(dS***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=48218%20
Barycenter	"HD 85040 A"
{
	ParentBody     "HD 85040"
	BinaryOrbit
	{
    Period          113.1
		Epoch           2451657.75847972
		Eccentricity    0.887
		AscendingNode   27.9
    ArgOfPericenter 332
		Inclination     107.5
    MeanAnomaly     0
	}
}

Star	"HD 85040 Aa"
{
	ParentBody     "HD 85040 A"
	Class	         "A7IVn"
	MassSol        2.1

	Orbit
	{
    PeriodDays      4.1467
		Epoch           2442094.102
    ArgOfPericenter 180
    MeanAnomaly     0
	}
}

Star	"HD 85040 Ab"
{
	ParentBody     "HD 85040 A"
	Class	         "A7IVn"
	MassSol        2.1

	Orbit
	{
    PeriodDays      4.1467
		Epoch           2442094.102
    ArgOfPericenter 0
    MeanAnomaly     0
	}
}

Star	"HD 85040 B"
{
	ParentBody     "HD 85040"
	Class	         "A8IV"
	MassSol        2.3

	/* BinaryOrbit
	{
    Period          113.1
		Epoch           2451657.75847972
		Eccentricity    0.887
		AscendingNode   27.9
    ArgOfPericenter 332
		Inclination     107.5
    MeanAnomaly     0
	} */
}

// 轩辕增卅一(PM**)
Remove "39 Leo A"{ParentBody "39 Leo"}
Remove "39 Leo B"{ParentBody "39 Leo"}
Star	"HD 89125 A"
{
	ParentBody     "HD 89125"
	Class	         "F6V"
	MassSol        0.98
	RadSol         0.99
	Luminosity     2.19
	Teff           6118
	FeH            -0.27
	Age            6.3

	BinaryOrbit
	{
    Separation      175
		PositionAngle   302.7
	}
}

Star	"HD 89125 B"
{
	ParentBody     "HD 89125"
	Class	         "M1"
	RadSol         0.48
	Teff           3740
	FeH            -0.33

	/* BinaryOrbit
	{
    Separation      175
		PositionAngle   302.7
	} */
}

// 轩辕增卅七(**)
Star	"HD 88355 A"
{
	ParentBody     "HD 88355"
	Class          "F6V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1672.03878
		Eccentricity    0.72349596
		Inclination     -1.39321804
		AscendingNode   0
		ArgOfPericenter -115.853095
		MeanAnomaly     -126.62976
	}
}

Star	"HD 88355 B"
{
	ParentBody     "HD 88355"
	Class          "F9.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1672.03878
		Eccentricity    0.72349596
		Inclination     -1.39321804
		AscendingNode   0
		ArgOfPericenter 64.1469054
		MeanAnomaly     -126.62976
	}
}

// 轩辕增四二(SB**)
Star	"HD 86360 A"
{
	ParentBody     "HD 86360"
	Class          "B6IV"
	MassSol        3.37
	RadSol         2.3
	Luminosity     244
	Teff           9552

	Orbit
	{
		PeriodDays      137.2978
		Eccentricity    0.7
		AscendingNode   293.7
		Epoch           2419815.9
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   20
	}
}

Star	"HD 86360 B"
{
	ParentBody     "HD 86360"
	Class          "A7.5 V"

	Orbit
	{
		PeriodDays      137.2978
		Eccentricity    0.7
		AscendingNode   293.7
		Epoch           2419815.9
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 轩辕增四八(SB**)
Remove "4 Sex A"{ParentBody "4 Sex"}
Remove "4 Sex B"{ParentBody "4 Sex"}
Star	"HD 85217 A"
{
	ParentBody     "HD 85217"
	Class          "F5V"
	MassSol        1.21
	RadSol         1.4
	Luminosity     5.2
	Teff           6367
	FeH            -0.07
	Age            2.2 // 2.6

	Orbit
	{
		PeriodDays      3.0546
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 85217 B"
{
	ParentBody     "HD 85217"
	Class          ""
	MassSol        1.15
	Luminosity     3.467 // ?

	Orbit
	{
		PeriodDays      3.0546
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 轩辕增五二(**)
Star	"HD 87682 A"
{
	ParentBody     "HD 87682"
	Class          "K1III"

	Orbit
	{
		RefPlane        "Equator"
		Period          2.95107557
		Eccentricity    0.611083925
		Inclination     0.171231747
		AscendingNode   0
		ArgOfPericenter -134.16168
		MeanAnomaly     24.3860686
	}
}

Star	"HD 87682 B"
{
	ParentBody     "HD 87682"
	Class          "A6.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2.95107557
		Eccentricity    0.611083925
		Inclination     0.171231747
		AscendingNode   0
		ArgOfPericenter 45.8383202
		MeanAnomaly     24.3860686
	}
}

// 轩辕增五七(a2**)
Star	"HD 90569 A"
{
	ParentBody     "HD 90569"
	Class          "B9.5IV-VpSiCrSr(Mn)"
	MassSol        2.7
	RadSol         2.7
	Luminosity     32
	Teff           10040
	RotationPeriod 12.1

	Orbit
	{
		Period          34.7
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 90569 B"
{
	ParentBody     "HD 90569"
	Class          ""
	MassSol        2.3
	Luminosity     32

	Orbit
	{
		Period          34.7
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 内平增七(RS**)
Remove "11 LMi A"{ParentBody "11 LMi"}
Remove "11 LMi B"{ParentBody "11 LMi"}
Star	"HD 82885 A"
{
	ParentBody     "HD 82885"
	Class          "G8V"
	MassSol        0.964
	RadSol         1.0029
	Luminosity     0.755
	Teff           5376
	FeH            0.33
	RotationPeriod 432
	Age            7.9

	Orbit
	{
		Period          201
		Eccentricity    0.88
		Inclination     117
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 82885 B"
{
	ParentBody     "HD 82885"
	Class          "M4"

	Orbit
	{
		Period          201
		Eccentricity    0.88
		Inclination     117
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 内平增九(PM**)
Remove "20 LMi A"{ParentBody "20 LMi"}
Remove "20 LMi B"{ParentBody "20 LMi"}
Star	"HD 86728 A"
{
	ParentBody     "HD 86728"
	Class          "G3VaHdel1"
	MassSol        1.12
	RadSol         1.247
	Luminosity     1.378
	Teff           5735
	RotationPeriod 255.36
	Age            6.2 // 7.7

	BinaryOrbit
	{
		Separation      2016
	}
}

Star	"HD 86728 B"
{
	ParentBody     "HD 86728"
	Class          "M7"
	MassSol        0.11
	RotationPeriod 462.4488

	/* BinaryOrbit
	{
		Separation      2016
	} */
}

//////////ExoPlanets//////////
Planet	"HD 86728 Ab"
{
	ParentBody     "HD 86728 A"
	DiscDate       "2020"
	Class          "IceGiant" // Hoptune
	Mass           10.17050816

	Orbit
	{
		SemiMajorAxis   0.2003
		PeriodDays      31.15
		Eccentricity    0.2
	}
}
