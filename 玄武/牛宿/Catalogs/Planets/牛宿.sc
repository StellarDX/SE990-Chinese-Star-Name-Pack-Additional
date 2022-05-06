// 牛宿增六(**)
Star	"HD 192876 A"
{
	ParentBody     "HD 192876"
	Class          "G3Ib"
  MassSol        5.3
  RadSol         36.3
  Luminosity     1047
  Teff           5119
  FeH            -0.02

	BinaryOrbit
	{
    Separation      175.501
	}
}

Star	"HD 192876 B"
{
	ParentBody     "HD 192876"
	Class          "G6.4 V"

  BinaryOrbit
	{
    Separation      175.501
	}
}

// 牛宿增七(**?)
// Gaia DR2说伴星到地球的距离比主星的还要远，可能是光学伴星
/*Star	"HD 192876 A"
{
	ParentBody     "HD 192876"
	Class          "B9IV"
  MassSol        2.37
	Luminosity     87
	Teff           10461
  FeH            -0.15
  Age            0.115

	BinaryOrbit
	{
    Separation      4219.8
	}
}

Star	"HD 192876 B"
{
	ParentBody     "HD 192876"
	Class          "F0.1 V"

  BinaryOrbit
	{
    Separation      4219.8
	}
}*/

// 牛宿增十(*Pl2)
Remove "Gliese 785 b"{ParentBody "Gliese 785"}
Remove "Gliese 785 c"{ParentBody "Gliese 785"}
Planet	"HD 192310 b"
{
	ParentBody     "GJ 785"
	DiscMethod     "RadVel"
	DiscDate       "2010" // La Silla Observatory
  Class          "IceGiant"
  Mass           16.9

  Interior // similar in composition to Neptune
  {
    Composition // mass fraction/values in percent
    {
      Hydrogen    12.0 // total mass of the atmosphere: 15% = 2.55 Mearth
      Helium      3.0
      Ices		78.0 // total mass of the water core: 100% - 15% - 7%
      Silicates	5.6 // total mass of the rocky/metal core: 1.2 Mearth = 7%
      Metals      1.4
    }
  }

	Orbit
	{
		SemiMajorAxis   0.32
    PeriodDays      74.72
		Eccentricity    0.13
	}
}

Planet	"HD 192310 c"
{
	ParentBody     "GJ 785"
	DiscMethod     "RadVel"
	DiscDate       "2011" // La Silla Observatory
  Class          "IceGiant"
  Mass           24

  Interior // similar in composition to Neptune
  {
    Composition // mass fraction/values in percent
    {
      Hydrogen    12.0 // total mass of the atmosphere: 15% = 2.55 Mearth
      Helium      3.0
      Ices		78.0 // total mass of the water core: 100% - 15% - 7%
      Silicates	5.6 // total mass of the rocky/metal core: 1.2 Mearth = 7%
      Metals      1.4
    }
  }

	Orbit
	{
		SemiMajorAxis   1.18
    PeriodDays      525.8
		Eccentricity    0.32
	}
}

// 河鼓增三(**)
Remove "CHI Aql A"{ParentBody "CHI Aql"}
Remove "CHI Aql B"{ParentBody "CHI Aql"}
Star "HD 186203 A"
{
	ParentBody "HD 186203"
	Class      "G2Ib"
	Luminosity 420
	Teff       5545

	BinaryOrbit
	{
		Epoch           2453005.50219322
		Separation      108.679
		PositionAngle   76.7
	}
}

Star "HD 186203 B"
{
	ParentBody "HD 186203"
	Class      "B5V"

	/*BinaryOrbit
	{
		Epoch           2453005.50219322
		Separation      108.679
		PositionAngle   76.7
	}*/
}

// 河鼓增四(**)
Star "PI Aql A/HD 187259"
{
	ParentBody "HIP 97473"
	Class      "G8III"
	Luminosity 108

	BinaryOrbit
	{
		Separation      229.92
	}
}

Star "PI Aql B/HD 187260"
{
	ParentBody "HIP 97473"
	Class      "A1V"

	/*BinaryOrbit
	{
		Separation      229.92
	}*/
}

// 河鼓增五(PM**)
Star "HD 187691 A"
{
	ParentBody "HD 187691"
	Class      "F8V"
	MassSol    1.252
	RadSol     1.52
	Teff       6090
	FeH        0.07
	Age        3.3

	BinaryOrbit
	{
		Separation      431
	}
}

Star "HD 187691 C"
{
	ParentBody "HD 187691"
	Class      "M3V"
	MassSol    0.33

	/*BinaryOrbit
	{
		Separation      431
	}*/
}

// 河鼓增六(SB**)
Star "HD 188728 A"
{
	ParentBody "HD 188728"
	Class      "A1IV"
	MassSol    2.39
	RadSol     1.8
	Luminosity 34
	Teff       9509
	FeH        0.47
	Age        0.28

	BinaryOrbit
	{
		PeriodDays      3.32068
		Separation      190.4
		Epoch           2454466.47098835
	}
}

Star "HD 188728 B"
{
	ParentBody "HD 188728"
	Class      ""
	MassSol    0.4

	/*BinaryOrbit
	{
		PeriodDays      3.32068
		Separation      190.4
		Epoch           2454466.47098835
	}*/
}

// 河鼓增八(*Pl)
Remove "Fortitudo"{ParentBody "Libertas"}
Planet	"HD 188310 b"
{
	ParentBody     "Libertas"
	DiscMethod     "RadVel" // Doppler spectroscopy?
	DiscDate       "2008" // Sato et al./Okayama Planet Search Program/Japan/2008.02.19
	Mass           889.919464

	Orbit
	{
		SemiMajorAxis   0.68
		PeriodDays      136.75
		Eccentricity    0
		Epoch           2453001.7
		ArgOfPericen    0
	}
}

// 右旗增五(***)
Barycenter "HD 185762 A"
{
	ParentBody "HD 185762"
	BinaryOrbit
	{
		Separation      4515.4
	}
}

Star "HD 185762 Aa"
{
	ParentBody "HD 185762 A"
	Class      "A3IV"
	MassSol    2.63
	Luminosity 75.8
	Teff       9016

	Orbit
	{
		Period          20.31
		Eccentricity    0.054
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 185762 Ab"
{
	ParentBody "HD 185762 A"
	Class      "F8.4 IV"

	Orbit
	{
		Period          20.31
		Eccentricity    0.054
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 185762 B"
{
	ParentBody "HD 185762"
	Class      "A6 V"

	/*BinaryOrbit
	{
		Separation      4515.4
	}*/
}

// 右旗增十二(**)
Star "右旗增十二/57 Aql A/BD-08 5154/HD 188293/HIP 97966/HR 7593/SAO 143898"
{
	ParentBody "57 Aql"
	Class      "B7Vn"

	BinaryOrbit
	{
		Separation      5272.35
	}
}

Star "57 Aql B/BD-08 5155/HD 188294/HIP 97967/HR 7594/SAO 143899"
{
	ParentBody "57 Aql"
	Class      "B8V"

	/*BinaryOrbit
	{
		Separation      5272.35
	}*/
}

// 左旗增三(SB**)
Star	"HD 182490 A"
{
	ParentBody     "HD 182490"
	Class          "A2III"

	Orbit
	{
		RefPlane        "Equator"
		Period          13.903952
		Eccentricity    0.43482551
		Inclination     1.08740067
		AscendingNode   0
		ArgOfPericenter -173.900815
		MeanAnomaly     -102.777368
	}
}

Star	"HD 182490 B"
{
	ParentBody     "HD 182490"
	Class          "F1.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          13.903952
		Eccentricity    0.43482551
		Inclination     1.08740067
		AscendingNode   0
		ArgOfPericenter 6.09918488
		MeanAnomaly     -102.777368
	}
}

// 左旗增六(Be**)
Star	"HD 183537 A"
{
	ParentBody     "HD 183537"
	Class          "B4IIIe" // B5IVe
	MassSol        5.5
	RadSol         5.2
	Teff           15600
	Age            0.05

	Orbit
	{
		PeriodDays      69.3
		Eccentricity    0.161
		Epoch           2454248.1
		ArgOfPericenter 67
		MeanAnomaly     0
		//SemiAmplitude   8.9
	}
}

Star	"HD 183537 B"
{
	ParentBody     "HD 183537"
	Class          ""
	MassSol        0.5

	Orbit
	{
		PeriodDays      69.3
		Eccentricity    0.161
		Epoch           2454248.1
		ArgOfPericenter 247
		MeanAnomaly     0
	}
}

// 左旗增十二(***)
Remove "23 Vul A"{ParentBody "23 Vul"}
Remove "23 Vul B"{ParentBody "23 Vul"}
Barycenter "HD 192806 A"
{
	ParentBody "HD 192806"
	BinaryOrbit
	{
		Separation      26
	}
}

Star "HD 192806 Aa"
{
	ParentBody "HD 192806 A"
	Class      "K3IIIFe-1"
	MassSol    2.4
	Luminosity 146
	Teff       4429
	FeH        0.03

	Orbit
	{
		Period          25.33
		Eccentricity    0.4
		Inclination     71.5
		AscendingNode   97.5
		Epoch           2455036.24881845
		ArgOfPericenter 113.8
		MeanAnomaly     0
	}
}

Star "HD 192806 Ab"
{
	ParentBody "HD 192806 A"
	Class      "F6.2 V"

	Orbit
	{
		Period          25.33
		Eccentricity    0.4
		Inclination     71.5
		AscendingNode   97.5
		Epoch           2455036.24881845
		ArgOfPericenter 293.8
		MeanAnomaly     0
	}
}

Star "HD 192806 B"
{
	ParentBody "HD 192806"
	Class      "B8.8 V"

	/*BinaryOrbit
	{
		Separation      26
	}*/
}

// 左旗增十三(SB**)
Star	"HD 191747 A"
{
	ParentBody     "HD 191747"
	Class          "A3III"
	MassSol        2.4
	RadSol         3.5
	Teff           8300

	Orbit
	{
		PeriodDays      9.314077
		Eccentricity    0.0116
		Epoch           2454875.09
		ArgOfPericenter 139.4
		MeanAnomaly     0
		//SemiAmplitude   78.33
	}
}

Star	"HD 191747 B"
{
	ParentBody     "HD 191747"
	Class          ""
	MassSol        2.2
	RadSol         2.4

	Orbit
	{
		PeriodDays      9.314077
		Eccentricity    0.0116
		Epoch           2454875.09
		ArgOfPericenter 319.4
		MeanAnomaly     0
		//SemiAmplitude   82.8
	}
}

// 左旗增十六(**)
Star	"HD 190004 A"
{
	ParentBody     "HD 190004"
	Class          "F2III"
	MassSol        1.34
	Luminosity     31.13
	Teff           6888
	FeH            0.17
	Age            0.742

	Orbit
	{
		Period          1201
		Eccentricity    0.932
		Inclination     79
		AscendingNode   84.5
		Epoch           2401762.02170425
		ArgOfPericenter 96.5
		MeanAnomaly     0
	}
}

Star	"HD 190004 B"
{
	ParentBody     "HD 190004"
	Class          "F4.6 V"

	Orbit
	{
		Period          1201
		Eccentricity    0.932
		Inclination     79
		AscendingNode   84.5
		Epoch           2401762.02170425
		ArgOfPericenter 276.5
		MeanAnomaly     0
	}
}

// 左旗增十七(**)
Star	"HD 188260 A"
{
	ParentBody     "HD 188260"
	Class          "B9.5III"
	RadSol         1.3
	Luminosity     180
	Teff           8801
	FeH            -0.11

	Orbit
	{
		Period          615.25
		Eccentricity    0.079
		Inclination     85.9
		AscendingNode   68.1
		Epoch           2461705.57136819
		ArgOfPericenter 349.7
		MeanAnomaly     0
	}
}

Star	"HD 188260 B"
{
	ParentBody     "HD 188260"
	Class          "F9.8 V"

	Orbit
	{
		Period          615.25
		Eccentricity    0.079
		Inclination     85.9
		AscendingNode   68.1
		Epoch           2461705.57136819
		ArgOfPericenter 169.7
		MeanAnomaly     0
	}
}

// 左旗增廿三(EB**)
Star	"HD 192713 A"
{
	ParentBody     "HD 192713"
	Class          "G2II"
	MassSol        5.4
	RadSol         77
	Teff           4700

	Orbit
	{
		PeriodDays      249.131
		Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   27.03
	}
}

Star	"HD 192713 B"
{
	ParentBody     "HD 192713"
	Class          "B8.5V"
	MassSol        3.4
	RadSol         3.3
	Teff           10900

	Orbit
	{
		PeriodDays      249.131
		Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 左旗增廿五(PM**)
Star	"TET Sge A/HIP 99352/HR 7705/SAO 88276"
{
	ParentBody     "HD 191570"
	Class          "F3V"
	MassSol        1.52
	RadSol         1.45
	Luminosity     4
	Teff           6750
	FeH            -0.17
	Age            2.089

	BinaryOrbit
	{
		Separation      502
	}
}

Star	"TET Sge B/HIP 99351/SAO 88275"
{
	ParentBody     "HD 191570"
	Class          "G5V"
	MassSol        0.95
	RadSol         0.82
	Luminosity     0.516
	Teff           5394

	/*BinaryOrbit
	{
		Separation      502
	}*/
}

// 左旗增廿五(PM**)
Remove "HD 190406 A"{ParentBody "15 Sge"}
Remove "HD 190406 B"{ParentBody "15 Sge"}
Star "HD 190406 1"
{
	ParentBody "HD 190406"
	Class      "G0V"
	MassSol    1.08
	RadSol     1.115
	Luminosity 1.338
	Teff       5883
	FeH        0.05
	RotationPeriod 420
	Age        2.5

	Orbit
	{
		Period          73.3
		Eccentricity    0.5
		Inclination     97.3
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 190406 2"
{
	ParentBody "HD 190406"
	DiscMethod "Imaging/RadVel"
	DiscDate   "2002" // Lick Observatory/2002
	Class      "L4"
	Mass       21834.809706
	Radius     71492
	Luminosity 0.000075
	Teff       1510

	Orbit
	{
		Period          73.3
		Eccentricity    0.5
		Inclination     97.3
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 左旗增廿八(cC***)
Star "HD 188727 A"
{
	ParentBody "HD 188727"
	Class      "F6Ib"
	MassSol    7
	RadSol     58.5
	Luminosity 5200
	Teff       5400

	Orbit
	{
		PeriodDays      676
		SemiMajorAxis   0.921688202
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HD 188727 B"
{
	ParentBody "HD 188727"
	Orbit
	{
		PeriodDays      676
		SemiMajorAxis   2.3042206
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 188727 Ba"
{
	ParentBody "HD 188727 B"
	Class      "A7V"
	MassSol    1.5

	Orbit
	{
		RefPlane        "Equator"
		Period          0.162925572
		Eccentricity    0
		Inclination     1.6988622
		AscendingNode   0
		ArgOfPericenter 94.4975807
		MeanAnomaly     -162.786759
	}
}

Star "HD 188727 Bb"
{
	ParentBody "HD 188727 B"
	Class      ""
	MassSol    1.3

	Orbit
	{
		RefPlane        "Equator"
		Period          0.162925572
		Eccentricity    0
		Inclination     1.6988622
		AscendingNode   0
		ArgOfPericenter 274.497581
		MeanAnomaly     -162.786759
	}
}

// 左旗增廿九(BSG**?)
/*Star	"HD 188001 A"
{
	ParentBody     "HD 188001"
	Class          "O7.5Iabf"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00583421732
		Eccentricity    0
		Inclination     -0.789649963
		AscendingNode   0
		ArgOfPericenter -18.584053
		MeanAnomaly     -133.363082
	}
}

Star	"HD 188001 B"
{
	ParentBody     "HD 188001"
	Class          "O8.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00583421732
		Eccentricity    0
		Inclination     -0.789649963
		AscendingNode   0
		ArgOfPericenter 161.415947
		MeanAnomaly     -133.363082
	}
}*/

// 渐台增一(SB**)
// 原版的那个K型巨星其实只是系统的一颗光学伴星，并不是真正的伴星。
Remove "DEL1 Lyr A"{ParentBody "DEL1 Lyr"}
Remove "DEL1 Lyr B"{ParentBody "DEL1 Lyr"}
Star	"HD 175426 A"
{
	ParentBody     "HD 175426"
	Class          "B2.5V"
	MassSol        7.9 // 7.75 // 6.6
	Luminosity     838
	LumBol         3620
	Teff           20350
	FeH            -0.05
	Age            0.0211

	Orbit
	{
		PeriodDays      88.352
		Eccentricity    0.37
		Epoch           2428406.613
		ArgOfPericenter 11.3
		MeanAnomaly     0
		//SemiAmplitude   39.7
	}
}

Star	"HD 175426 B"
{
	ParentBody     "HD 175426"
	Class          "B9.9 V"

	Orbit
	{
		PeriodDays      88.352
		Eccentricity    0.37
		Epoch           2428406.613
		ArgOfPericenter 191.3
		MeanAnomaly     0
	}
}

// 渐台增三(SB***)
Remove "17 Lyr A"{ParentBody "17 Lyr"}
Remove "17 Lyr B"{ParentBody "17 Lyr"}
Barycenter "HD 178449 A"
{
	ParentBody "HD 178449"
	BinaryOrbit
	{
		Separation      103.168
	}
}

Star "HD 178449 Aa"
{
	ParentBody "HD 178449 A"
	Class      "F0V"
	MassSol    1.6
	Luminosity 16.4
	Teff       6887
	FeH        0
	Age        1.4

	Orbit
	{
		PeriodDays      42.857
		Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   13.1
	}
}

Star "HD 178449 Ab"
{
	ParentBody "HD 178449 A"
	Class      "G0.9 V"

	Orbit
	{
		PeriodDays      42.857
		Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 178449 B"
{
	ParentBody "HD 178449"
	Class      "F6 V"

	/*BinaryOrbit
	{
		Separation      103.168
	}*/
}

// 渐台增四(V**)
Star	"HD 176670 A"
{
	ParentBody     "HD 176670"
	Class          "K2.5III:Ba0.5"
	MassSol        6.3
	RadSol         102.11
	Luminosity     3073.1
	Teff           4253
	FeH            -0.02
	Age            0.0584

	Orbit
	{
		RefPlane        "Equator"
		Period          0.310359314
		Eccentricity    0
		Inclination     -0.13988018
		AscendingNode   0
		ArgOfPericenter -178.48724
		MeanAnomaly     -24.8998023
	}
}

Star	"HD 176670 B"
{
	ParentBody     "HD 176670"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.310359314
		Eccentricity    0
		Inclination     -0.13988018
		AscendingNode   0
		ArgOfPericenter 1.51276035
		MeanAnomaly     -24.8998023
	}
}

// 辇道增一(PM**)
Star	"HD 177196 A"
{
	ParentBody     "HD 177196"
	Class          "A6IV"
	MassSol        1.8
	RadSol         1.87
	Luminosity     12.043
	Teff           7870
	Age            0.791

	Orbit
	{
		RefPlane        "Equator"
		Period          0.135625329
		Eccentricity    0.534112632
		Inclination     -0.66547823
		AscendingNode   0
		ArgOfPericenter 75.7291908
		MeanAnomaly     -17.3175947
	}
}

Star	"HD 177196 B"
{
	ParentBody     "HD 177196"
	Class          "F8.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.135625329
		Eccentricity    0.534112632
		Inclination     -0.66547823
		AscendingNode   0
		ArgOfPericenter 255.729191
		MeanAnomaly     -17.3175947
	}
}

// 辇道增五(**)
Remove "ETA Cyg A"{ParentBody "ETA Cyg"}
Remove "ETA Cyg B"{ParentBody "ETA Cyg"}
Star "HD 188947 A"
{
	ParentBody "HD 188947"
	Class      "K0III"
	MassSol    1.59
	RadSol     11
	Luminosity 52.5
	Teff       4783
	FeH        -0.09
	Age        3.29

	BinaryOrbit
	{
		Epoch           2454101.22878957
		Separation      320.58
		PositionAngle   206
	}
}

Star "HD 188947 B"
{
	ParentBody "HD 188947"
	Class      "F6.7 V"

	/*BinaryOrbit
	{
		Epoch           2454101.22878957
		Separation      320.58
		PositionAngle   206
	}*/
}

// 辇道增六(SB**)
Star	"HD 185734 A"
{
	ParentBody     "HD 185734"
	Class          "K0III"
	MassSol        2.16
	RadSol         8.9
	Luminosity     44
	Teff           4875
	FeH            -0.11

	Orbit
	{
		PeriodDays      434.208
		Eccentricity    0.5557
		Inclination     80.8
		AscendingNode   251
		Epoch           2451239.58
		ArgOfPericenter 29.41
		MeanAnomaly     0
		//SemiAmplitude   26.4
	}
}

Star	"HD 185734 B"
{
	ParentBody     "HD 185734"
	Class          "K0III"
	MassSol        2.06
	RadSol         7.8
	Luminosity     34
	Teff           4875
	Age            0.65

	Orbit
	{
		PeriodDays      434.208
		Eccentricity    0.5557
		Inclination     80.8
		AscendingNode   251
		Epoch           2451239.58
		ArgOfPericenter 209.41
		MeanAnomaly     0
		//SemiAmplitude   27.22
	}
}

// 辇道增七(****?)
// Ab, B存疑
Remove "Albireo A"{ParentBody "Albireo"}
Remove "Albireo B"{ParentBody "Albireo"}
Remove "Albireo Aa"{ParentBody "Albireo A"}
Remove "Albireo Ac"{ParentBody "Albireo A"}
Barycenter	"Albireo Aabc/BET1 Cyg Aabc/BD+27 3410/HR 7417 A/HIP 95947 A/SAO 87301 A/FK5 732/MCA 55 Aac/NSV 12105"
{
	ParentBody	"Albireo"
	BinaryOrbit
	{
		Period		    	100000
		Epoch           2453735.98659079
		Separation      4694.9
		PositionAngle   54
	}
}

Barycenter	"Albireo Aab/HD 183912"
{
	ParentBody     "Albireo Aabc"
	Orbit
	{
		Period          121.65
		Eccentricity    0.2
		Inclination     156.15
		AscendingNode   84.43
		Epoch           2461172.31775797
		ArgOfPericenter 234.72
		MeanAnomaly     0
		//SemiAmplitude   2.91
	}
}

Star	"Albireo Aa"
{
	ParentBody	"Albireo Aab"
	Class       "K3II"
	MassSol     5.2
	RadSol      62
	LumBol      1259
	Teff        4383
	FeH         -0.1

	Orbit
	{
		RefPlane        "Equator"
		Period          0.209751024
		Eccentricity    0
		Inclination     1.74314505
		AscendingNode   0
		ArgOfPericenter 172.418495
		MeanAnomaly     92.7711674
	}
}

Star	"Albireo Ab"
{
	ParentBody     "Albireo Aab"
	Class          "F1.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.209751024
		Eccentricity    0
		Inclination     1.74314505
		AscendingNode   0
		ArgOfPericenter 352.418495
		MeanAnomaly     92.7711674
	}
}

Star	"Albireo Ac/HD 183913"
{
	ParentBody	"Albireo Aabc"
	Class       "B8V"
	MassSol     2.7
	RadSol      3
	LumBol      79
	Teff        10000

	Orbit
	{
		Period          121.65
		Eccentricity    0.2
		Inclination     156.15
		AscendingNode   84.43
		Epoch           2461172.31775797
		ArgOfPericenter 54.72
		MeanAnomaly     0
	}
}

Star	"BET2 Cygni B/STF 4043B/BD+27 3411/HD 183914 B/HIP 95951 B/HR 7418 B/SAO 87302 B"
{
	ParentBody	"Albireo"
	Class       "B8V"
	MassSol     3.7
	RadSol      2.59
	LumBol      230
	Teff        13200
	Age         0.1

	/*BinaryOrbit
	{
		Period		    	100000
		Epoch           2453735.98659079
		Separation      4694.9
		PositionAngle   54
	}*/
}
